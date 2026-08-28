import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.function.IntFunction;

public class epr extends enm {
   public static final MapCodec<epr> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(a($$0), epr.a.c.fieldOf("mineshaft_type").forGetter($$0x -> $$0x.e)).apply($$0, epr::new)
   );
   private final epr.a e;

   public epr(enm.c $$0, epr.a $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   public Optional<enm.b> a(enm.a $$0) {
      $$0.f().j();
      dfo $$1 = $$0.h();
      ji $$2 = new ji($$1.b(), 50, $$1.e());
      eoe $$3 = new eoe();
      int $$4 = this.a($$3, $$0);
      return Optional.of(new enm.b($$2.b(0, $$4, 0), Either.right($$3)));
   }

   private int a(eoe $$0, enm.a $$1) {
      dfo $$2 = $$1.h();
      edr $$3 = $$1.f();
      dyt $$4 = $$1.b();
      epq.d $$5 = new epq.d(0, $$3, $$2.a(2), $$2.b(2), this.e);
      $$0.a($$5);
      $$5.a($$5, $$0, $$3);
      int $$6 = $$4.f();
      if (this.e == epr.a.b) {
         ji $$7 = $$0.d().g();
         int $$8 = $$4.a($$7.u(), $$7.w(), ecs.a.a, $$1.i(), $$1.d());
         int $$9 = $$8 <= $$6 ? $$6 : ayz.b($$3, $$6, $$8);
         int $$10 = $$9 - $$7.v();
         $$0.a($$10);
         return $$10;
      } else {
         return $$0.a($$6, $$4.g(), $$3, 10);
      }
   }

   @Override
   public env<?> e() {
      return env.h;
   }

   public static enum a implements azv {
      a("normal", djo.X, djo.n, djo.eh),
      b("mesa", djo.ad, djo.t, djo.kI);

      public static final Codec<epr.a> c = azv.a(epr.a::values);
      private static final IntFunction<epr.a> d = axq.a(Enum::ordinal, values(), axq.a.a);
      private final String e;
      private final dwx f;
      private final dwx g;
      private final dwx h;

      private a(final String $$0, final djm $$1, final djm $$2, final djm $$3) {
         this.e = $$0;
         this.f = $$1.m();
         this.g = $$2.m();
         this.h = $$3.m();
      }

      public String a() {
         return this.e;
      }

      public static epr.a a(int $$0) {
         return d.apply($$0);
      }

      public dwx b() {
         return this.f;
      }

      public dwx d() {
         return this.g;
      }

      public dwx e() {
         return this.h;
      }

      @Override
      public String c() {
         return this.e;
      }
   }
}
