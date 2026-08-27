import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.function.IntFunction;

public class efg extends edc {
   public static final Codec<efg> d = RecordCodecBuilder.create(
      $$0 -> $$0.group(a($$0), efg.a.c.fieldOf("mineshaft_type").forGetter($$0x -> $$0x.e)).apply($$0, efg::new)
   );
   private final efg.a e;

   public efg(edc.c $$0, efg.a $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   public Optional<edc.b> a(edc.a $$0) {
      $$0.f().j();
      cwg $$1 = $$0.h();
      ib $$2 = new ib($$1.b(), 50, $$1.e());
      edu $$3 = new edu();
      int $$4 = this.a($$3, $$0);
      return Optional.of(new edc.b($$2.b(0, $$4, 0), Either.right($$3)));
   }

   private int a(edu $$0, edc.a $$1) {
      cwg $$2 = $$1.h();
      dtl $$3 = $$1.f();
      dow $$4 = $$1.b();
      eff.d $$5 = new eff.d(0, $$3, $$2.a(2), $$2.b(2), this.e);
      $$0.a($$5);
      $$5.a($$5, $$0, $$3);
      int $$6 = $$4.e();
      if (this.e == efg.a.b) {
         ib $$7 = $$0.d().g();
         int $$8 = $$4.a($$7.u(), $$7.w(), dsm.a.a, $$1.i(), $$1.d());
         int $$9 = $$8 <= $$6 ? $$6 : aww.b($$3, $$6, $$8);
         int $$10 = $$9 - $$7.v();
         $$0.a($$10);
         return $$10;
      } else {
         return $$0.a($$6, $$4.f(), $$3, 10);
      }
   }

   @Override
   public edl<?> e() {
      return edl.h;
   }

   public static enum a implements axq {
      a("normal", dac.U, dac.n, dac.dU),
      b("mesa", dac.aa, dac.t, dac.ki);

      public static final Codec<efg.a> c = axq.a(efg.a::values);
      private static final IntFunction<efg.a> d = avn.a(Enum::ordinal, values(), avn.a.a);
      private final String e;
      private final dmz f;
      private final dmz g;
      private final dmz h;

      private a(String $$0, daa $$1, daa $$2, daa $$3) {
         this.e = $$0;
         this.f = $$1.o();
         this.g = $$2.o();
         this.h = $$3.o();
      }

      public String a() {
         return this.e;
      }

      public static efg.a a(int $$0) {
         return d.apply($$0);
      }

      public dmz b() {
         return this.f;
      }

      public dmz d() {
         return this.g;
      }

      public dmz e() {
         return this.h;
      }

      @Override
      public String c() {
         return this.e;
      }
   }
}
