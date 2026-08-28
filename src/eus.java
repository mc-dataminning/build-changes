import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.function.IntFunction;

public class eus extends esn {
   public static final MapCodec<eus> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(a($$0), eus.a.c.fieldOf("mineshaft_type").forGetter($$0x -> $$0x.e)).apply($$0, eus::new)
   );
   private final eus.a e;

   public eus(esn.c $$0, eus.a $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   public Optional<esn.b> a(esn.a $$0) {
      $$0.f().j();
      djo $$1 = $$0.h();
      iw $$2 = new iw($$1.b(), 50, $$1.e());
      etf $$3 = new etf();
      int $$4 = this.a($$3, $$0);
      return Optional.of(new esn.b($$2.b(0, $$4, 0), Either.right($$3)));
   }

   private int a(etf $$0, esn.a $$1) {
      djo $$2 = $$1.h();
      eio $$3 = $$1.f();
      edo $$4 = $$1.b();
      eur.d $$5 = new eur.d(0, $$3, $$2.a(2), $$2.b(2), this.e);
      $$0.a($$5);
      $$5.a($$5, $$0, $$3);
      int $$6 = $$4.f();
      if (this.e == eus.a.b) {
         iw $$7 = $$0.d().g();
         int $$8 = $$4.a($$7.u(), $$7.w(), ehp.a.a, $$1.i(), $$1.d());
         int $$9 = $$8 <= $$6 ? $$6 : azz.b($$3, $$6, $$8);
         int $$10 = $$9 - $$7.v();
         $$0.a($$10);
         return $$10;
      } else {
         return $$0.a($$6, $$4.g(), $$3, 10);
      }
   }

   @Override
   public esw<?> e() {
      return esw.h;
   }

   public static enum a implements bax {
      a("normal", dnq.X, dnq.n, dnq.el),
      b("mesa", dnq.ad, dnq.t, dnq.kM);

      public static final Codec<eus.a> c = bax.a(eus.a::values);
      private static final IntFunction<eus.a> d = ayo.a(Enum::ordinal, values(), ayo.a.a);
      private final String e;
      private final ebq f;
      private final ebq g;
      private final ebq h;

      private a(final String $$0, final dno $$1, final dno $$2, final dno $$3) {
         this.e = $$0;
         this.f = $$1.m();
         this.g = $$2.m();
         this.h = $$3.m();
      }

      public String a() {
         return this.e;
      }

      public static eus.a a(int $$0) {
         return d.apply($$0);
      }

      public ebq b() {
         return this.f;
      }

      public ebq d() {
         return this.g;
      }

      public ebq e() {
         return this.h;
      }

      @Override
      public String c() {
         return this.e;
      }
   }
}
