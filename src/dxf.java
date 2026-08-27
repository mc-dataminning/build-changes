import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.function.IntFunction;

public class dxf extends dvi {
   public static final Codec<dxf> d = RecordCodecBuilder.create(
      $$0 -> $$0.group(a($$0), dxf.a.c.fieldOf("mineshaft_type").forGetter($$0x -> $$0x.e)).apply($$0, dxf::new)
   );
   private final dxf.a e;

   public dxf(dvi.c $$0, dxf.a $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   public Optional<dvi.b> a(dvi.a $$0) {
      $$0.f().j();
      cpc $$1 = $$0.h();
      gw $$2 = new gw($$1.b(), 50, $$1.e());
      dwa $$3 = new dwa();
      int $$4 = this.a($$3, $$0);
      return Optional.of(new dvi.b($$2.b(0, $$4, 0), Either.right($$3)));
   }

   private int a(dwa $$0, dvi.a $$1) {
      cpc $$2 = $$1.h();
      dlr $$3 = $$1.f();
      dhg $$4 = $$1.b();
      dxe.d $$5 = new dxe.d(0, $$3, $$2.a(2), $$2.b(2), this.e);
      $$0.a($$5);
      $$5.a($$5, $$0, $$3);
      int $$6 = $$4.e();
      if (this.e == dxf.a.b) {
         gw $$7 = $$0.d().f();
         int $$8 = $$4.a($$7.u(), $$7.w(), dks.a.a, $$1.i(), $$1.d());
         int $$9 = $$8 <= $$6 ? $$6 : arw.b($$3, $$6, $$8);
         int $$10 = $$9 - $$7.v();
         $$0.a($$10);
         return $$10;
      } else {
         return $$0.a($$6, $$4.f(), $$3, 10);
      }
   }

   @Override
   public dvr<?> e() {
      return dvr.h;
   }

   public static enum a implements asp {
      a("normal", csw.U, csw.n, csw.dU),
      b("mesa", csw.aa, csw.t, csw.ki);

      public static final Codec<dxf.a> c = asp.a(dxf.a::values);
      private static final IntFunction<dxf.a> d = aqr.a(Enum::ordinal, values(), aqr.a.a);
      private final String e;
      private final dfj f;
      private final dfj g;
      private final dfj h;

      private a(String $$0, csv $$1, csv $$2, csv $$3) {
         this.e = $$0;
         this.f = $$1.n();
         this.g = $$2.n();
         this.h = $$3.n();
      }

      public String a() {
         return this.e;
      }

      public static dxf.a a(int $$0) {
         return d.apply($$0);
      }

      public dfj b() {
         return this.f;
      }

      public dfj d() {
         return this.g;
      }

      public dfj e() {
         return this.h;
      }

      @Override
      public String c() {
         return this.e;
      }
   }
}
