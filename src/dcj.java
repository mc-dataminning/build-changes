import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class dcj implements dbk {
   final dck c;
   final cxh d;
   final String e;
   final dbi f;
   final boolean g;
   @Nullable
   private dbu h;

   public dcj(String $$0, dbi $$1, dck $$2, cxh $$3, boolean $$4) {
      this.e = $$0;
      this.f = $$1;
      this.c = $$2;
      this.d = $$3;
      this.g = $$4;
   }

   public dcj(String $$0, dbi $$1, dck $$2, cxh $$3) {
      this($$0, $$1, $$2, $$3, true);
   }

   @Override
   public dcf<? extends dcj> a() {
      return dcf.a;
   }

   @Override
   public String j() {
      return this.e;
   }

   @Override
   public dbi c() {
      return this.f;
   }

   @VisibleForTesting
   public List<Optional<dbr>> f() {
      return this.c.c();
   }

   @Override
   public dbu ao_() {
      if (this.h == null) {
         this.h = dbu.a(this.c.c());
      }

      return this.h;
   }

   @Override
   public boolean i() {
      return this.g;
   }

   public boolean a(dbj $$0, dgz $$1) {
      return this.c.a($$0);
   }

   public cxh a(dbj $$0, jt.a $$1) {
      return this.d.v();
   }

   public int k() {
      return this.c.a();
   }

   public int l() {
      return this.c.b();
   }

   @Override
   public List<ddb> g() {
      return List.of(
         new ddf(this.c.a(), this.c.b(), this.c.c().stream().map($$0 -> $$0.<ddh>map(dbr::c).orElse(ddh.c.c)).toList(), new ddh.f(this.d), new ddh.d(cxl.fe))
      );
   }

   public static class a implements dcf<dcj> {
      public static final MapCodec<dcj> w = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  Codec.STRING.optionalFieldOf("group", "").forGetter($$0x -> $$0x.e),
                  dbi.e.fieldOf("category").orElse(dbi.d).forGetter($$0x -> $$0x.f),
                  dck.b.forGetter($$0x -> $$0x.c),
                  cxh.d.fieldOf("result").forGetter($$0x -> $$0x.d),
                  Codec.BOOL.optionalFieldOf("show_notification", true).forGetter($$0x -> $$0x.g)
               )
               .apply($$0, dcj::new)
      );
      public static final yn<wa, dcj> x = yn.a(dcj.a::a, dcj.a::a);

      @Override
      public MapCodec<dcj> a() {
         return w;
      }

      @Override
      public yn<wa, dcj> b() {
         return x;
      }

      private static dcj a(wa $$0) {
         String $$1 = $$0.p();
         dbi $$2 = $$0.b(dbi.class);
         dck $$3 = dck.c.decode($$0);
         cxh $$4 = cxh.i.decode($$0);
         boolean $$5 = $$0.readBoolean();
         return new dcj($$1, $$2, $$3, $$4, $$5);
      }

      private static void a(wa $$0, dcj $$1) {
         $$0.a($$1.e);
         $$0.a($$1.f);
         dck.c.encode($$0, $$1.c);
         cxh.i.encode($$0, $$1.d);
         $$0.a($$1.g);
      }
   }
}
