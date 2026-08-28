import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class dbq implements dar {
   final dbr c;
   final cwn d;
   final String e;
   final dap f;
   final boolean g;
   @Nullable
   private dbb h;

   public dbq(String $$0, dap $$1, dbr $$2, cwn $$3, boolean $$4) {
      this.e = $$0;
      this.f = $$1;
      this.c = $$2;
      this.d = $$3;
      this.g = $$4;
   }

   public dbq(String $$0, dap $$1, dbr $$2, cwn $$3) {
      this($$0, $$1, $$2, $$3, true);
   }

   @Override
   public dbm<? extends dbq> a() {
      return dbm.a;
   }

   @Override
   public String j() {
      return this.e;
   }

   @Override
   public dap c() {
      return this.f;
   }

   @VisibleForTesting
   public List<Optional<day>> f() {
      return this.c.c();
   }

   @Override
   public dbb ao_() {
      if (this.h == null) {
         this.h = dbb.a(this.c.c());
      }

      return this.h;
   }

   @Override
   public boolean i() {
      return this.g;
   }

   public boolean a(daq $$0, dgg $$1) {
      return this.c.a($$0);
   }

   public cwn a(daq $$0, jt.a $$1) {
      return this.d.v();
   }

   public int k() {
      return this.c.a();
   }

   public int l() {
      return this.c.b();
   }

   @Override
   public List<dch> g() {
      return List.of(
         new dcl(this.c.a(), this.c.b(), this.c.c().stream().map($$0 -> $$0.<dcn>map(day::c).orElse(dcn.c.c)).toList(), new dcn.f(this.d), new dcn.d(cwr.fc))
      );
   }

   public static class a implements dbm<dbq> {
      public static final MapCodec<dbq> w = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  Codec.STRING.optionalFieldOf("group", "").forGetter($$0x -> $$0x.e),
                  dap.e.fieldOf("category").orElse(dap.d).forGetter($$0x -> $$0x.f),
                  dbr.b.forGetter($$0x -> $$0x.c),
                  cwn.c.fieldOf("result").forGetter($$0x -> $$0x.d),
                  Codec.BOOL.optionalFieldOf("show_notification", true).forGetter($$0x -> $$0x.g)
               )
               .apply($$0, dbq::new)
      );
      public static final ym<vz, dbq> x = ym.a(dbq.a::a, dbq.a::a);

      @Override
      public MapCodec<dbq> a() {
         return w;
      }

      @Override
      public ym<vz, dbq> b() {
         return x;
      }

      private static dbq a(vz $$0) {
         String $$1 = $$0.p();
         dap $$2 = $$0.b(dap.class);
         dbr $$3 = dbr.c.decode($$0);
         cwn $$4 = cwn.h.decode($$0);
         boolean $$5 = $$0.readBoolean();
         return new dbq($$1, $$2, $$3, $$4, $$5);
      }

      private static void a(vz $$0, dbq $$1) {
         $$0.a($$1.e);
         $$0.a($$1.f);
         dbr.c.encode($$0, $$1.c);
         cwn.h.encode($$0, $$1.d);
         $$0.a($$1.g);
      }
   }
}
