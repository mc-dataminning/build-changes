import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class dcz implements dca {
   final dda c;
   final cxy d;
   final String e;
   final dby f;
   final boolean g;
   @Nullable
   private dck h;

   public dcz(String $$0, dby $$1, dda $$2, cxy $$3, boolean $$4) {
      this.e = $$0;
      this.f = $$1;
      this.c = $$2;
      this.d = $$3;
      this.g = $$4;
   }

   public dcz(String $$0, dby $$1, dda $$2, cxy $$3) {
      this($$0, $$1, $$2, $$3, true);
   }

   @Override
   public dcv<? extends dcz> a() {
      return dcv.a;
   }

   @Override
   public String j() {
      return this.e;
   }

   @Override
   public dby c() {
      return this.f;
   }

   @VisibleForTesting
   public List<Optional<dch>> f() {
      return this.c.c();
   }

   @Override
   public dck ak_() {
      if (this.h == null) {
         this.h = dck.a(this.c.c());
      }

      return this.h;
   }

   @Override
   public boolean i() {
      return this.g;
   }

   public boolean a(dbz $$0, dhp $$1) {
      return this.c.a($$0);
   }

   public cxy a(dbz $$0, ju.a $$1) {
      return this.d.v();
   }

   public int k() {
      return this.c.a();
   }

   public int l() {
      return this.c.b();
   }

   @Override
   public List<ddr> g() {
      return List.of(
         new ddv(this.c.a(), this.c.b(), this.c.c().stream().map($$0 -> $$0.<ddx>map(dch::c).orElse(ddx.c.c)).toList(), new ddx.f(this.d), new ddx.d(cyc.fe))
      );
   }

   public static class a implements dcv<dcz> {
      public static final MapCodec<dcz> w = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  Codec.STRING.optionalFieldOf("group", "").forGetter($$0x -> $$0x.e),
                  dby.e.fieldOf("category").orElse(dby.d).forGetter($$0x -> $$0x.f),
                  dda.b.forGetter($$0x -> $$0x.c),
                  cxy.d.fieldOf("result").forGetter($$0x -> $$0x.d),
                  Codec.BOOL.optionalFieldOf("show_notification", true).forGetter($$0x -> $$0x.g)
               )
               .apply($$0, dcz::new)
      );
      public static final yt<wg, dcz> x = yt.a(dcz.a::a, dcz.a::a);

      @Override
      public MapCodec<dcz> a() {
         return w;
      }

      @Override
      public yt<wg, dcz> b() {
         return x;
      }

      private static dcz a(wg $$0) {
         String $$1 = $$0.p();
         dby $$2 = $$0.b(dby.class);
         dda $$3 = dda.c.decode($$0);
         cxy $$4 = cxy.i.decode($$0);
         boolean $$5 = $$0.readBoolean();
         return new dcz($$1, $$2, $$3, $$4, $$5);
      }

      private static void a(wg $$0, dcz $$1) {
         $$0.a($$1.e);
         $$0.a($$1.f);
         dda.c.encode($$0, $$1.c);
         cxy.i.encode($$0, $$1.d);
         $$0.a($$1.g);
      }
   }
}
