import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.function.IntFunction;

public class eqi extends eod {
   public static final MapCodec<eqi> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(a($$0), eqi.a.c.fieldOf("mineshaft_type").forGetter($$0x -> $$0x.e)).apply($$0, eqi::new)
   );
   private final eqi.a e;

   public eqi(eod.c $$0, eqi.a $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   public Optional<eod.b> a(eod.a $$0) {
      $$0.f().j();
      dgf $$1 = $$0.h();
      jh $$2 = new jh($$1.b(), 50, $$1.e());
      eov $$3 = new eov();
      int $$4 = this.a($$3, $$0);
      return Optional.of(new eod.b($$2.b(0, $$4, 0), Either.right($$3)));
   }

   private int a(eov $$0, eod.a $$1) {
      dgf $$2 = $$1.h();
      eei $$3 = $$1.f();
      dzk $$4 = $$1.b();
      eqh.d $$5 = new eqh.d(0, $$3, $$2.a(2), $$2.b(2), this.e);
      $$0.a($$5);
      $$5.a($$5, $$0, $$3);
      int $$6 = $$4.f();
      if (this.e == eqi.a.b) {
         jh $$7 = $$0.d().g();
         int $$8 = $$4.a($$7.u(), $$7.w(), edj.a.a, $$1.i(), $$1.d());
         int $$9 = $$8 <= $$6 ? $$6 : azu.b($$3, $$6, $$8);
         int $$10 = $$9 - $$7.v();
         $$0.a($$10);
         return $$10;
      } else {
         return $$0.a($$6, $$4.g(), $$3, 10);
      }
   }

   @Override
   public eom<?> e() {
      return eom.h;
   }

   public static enum a implements baq {
      a("normal", dkf.X, dkf.n, dkf.eh),
      b("mesa", dkf.ad, dkf.t, dkf.kI);

      public static final Codec<eqi.a> c = baq.a(eqi.a::values);
      private static final IntFunction<eqi.a> d = ayl.a(Enum::ordinal, values(), ayl.a.a);
      private final String e;
      private final dxo f;
      private final dxo g;
      private final dxo h;

      private a(final String $$0, final dkd $$1, final dkd $$2, final dkd $$3) {
         this.e = $$0;
         this.f = $$1.m();
         this.g = $$2.m();
         this.h = $$3.m();
      }

      public String a() {
         return this.e;
      }

      public static eqi.a a(int $$0) {
         return d.apply($$0);
      }

      public dxo b() {
         return this.f;
      }

      public dxo d() {
         return this.g;
      }

      public dxo e() {
         return this.h;
      }

      @Override
      public String c() {
         return this.e;
      }
   }
}
