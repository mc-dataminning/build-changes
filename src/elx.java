import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.function.IntFunction;

public class elx extends ejt {
   public static final Codec<elx> d = RecordCodecBuilder.create(
      $$0 -> $$0.group(a($$0), elx.a.d.fieldOf("mineshaft_type").forGetter($$0x -> $$0x.e)).apply($$0, elx::new)
   );
   private final elx.a e;

   public elx(ejt.d $$0, elx.a $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   public Optional<ejt.c> a(ejt.b $$0) {
      $$0.f().j();
      dbh $$1 = $$0.h();
      ir $$2 = new ir($$1.b(), 50, $$1.e());
      ekl $$3 = new ekl();
      int $$4 = this.a($$3, $$0);
      return Optional.of(new ejt.c($$2.b(0, $$4, 0), Either.right($$3)));
   }

   private int a(ekl $$0, ejt.b $$1) {
      dbh $$2 = $$1.h();
      dzt $$3 = $$1.f();
      duz $$4 = $$1.b();
      elw.d $$5 = new elw.d(0, $$3, $$2.a(2), $$2.b(2), this.e);
      $$0.a($$5);
      $$5.a($$5, $$0, $$3);
      int $$6 = $$4.e();
      if (this.e == elx.a.b) {
         ir $$7 = $$0.d().g();
         int $$8 = $$4.a($$7.u(), $$7.w(), dyu.a.a, $$1.i(), $$1.d());
         int $$9 = $$8 <= $$6 ? $$6 : aym.b($$3, $$6, $$8);
         int $$10 = $$9 - $$7.v();
         $$0.a($$10);
         return $$10;
      } else {
         return $$0.a($$6, $$4.f(), $$3, 10);
      }
   }

   @Override
   public ekc<?> f() {
      return ekc.h;
   }

   public static enum a implements azg {
      a("normal", dfe.aC, dfe.S, dfe.eI),
      b("mesa", dfe.aI, dfe.Y, dfe.lc),
      c("potato", dfe.tG, dfe.pG, dfe.pP);

      public static final Codec<elx.a> d = azg.a(elx.a::values);
      private static final IntFunction<elx.a> e = axd.a(Enum::ordinal, values(), axd.a.a);
      private final String f;
      private final dtc g;
      private final dtc h;
      private final dtc i;

      private a(String $$0, dfc $$1, dfc $$2, dfc $$3) {
         this.f = $$0;
         this.g = $$1.n();
         this.h = $$2.n();
         this.i = $$3.n();
      }

      public String a() {
         return this.f;
      }

      public static elx.a a(int $$0) {
         return e.apply($$0);
      }

      public dtc b() {
         return this.g;
      }

      public dtc d() {
         return this.h;
      }

      public dtc e() {
         return this.i;
      }

      @Override
      public String c() {
         return this.f;
      }
   }
}
