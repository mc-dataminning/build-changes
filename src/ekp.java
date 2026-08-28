import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.function.IntFunction;

public class ekp extends eil {
   public static final MapCodec<ekp> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(a($$0), ekp.a.c.fieldOf("mineshaft_type").forGetter($$0x -> $$0x.e)).apply($$0, ekp::new)
   );
   private final ekp.a e;

   public ekp(eil.c $$0, ekp.a $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   public Optional<eil.b> a(eil.a $$0) {
      $$0.f().j();
      dbg $$1 = $$0.h();
      iz $$2 = new iz($$1.b(), 50, $$1.e());
      ejd $$3 = new ejd();
      int $$4 = this.a($$3, $$0);
      return Optional.of(new eil.b($$2.b(0, $$4, 0), Either.right($$3)));
   }

   private int a(ejd $$0, eil.a $$1) {
      dbg $$2 = $$1.h();
      dyu $$3 = $$1.f();
      dua $$4 = $$1.b();
      eko.d $$5 = new eko.d(0, $$3, $$2.a(2), $$2.b(2), this.e);
      $$0.a($$5);
      $$5.a($$5, $$0, $$3);
      int $$6 = $$4.f();
      if (this.e == ekp.a.b) {
         iz $$7 = $$0.d().g();
         int $$8 = $$4.a($$7.u(), $$7.w(), dxv.a.a, $$1.i(), $$1.d());
         int $$9 = $$8 <= $$6 ? $$6 : ayz.b($$3, $$6, $$8);
         int $$10 = $$9 - $$7.v();
         $$0.a($$10);
         return $$10;
      } else {
         return $$0.a($$6, $$4.g(), $$3, 10);
      }
   }

   @Override
   public eiu<?> e() {
      return eiu.h;
   }

   public static enum a implements azu {
      a("normal", dfc.U, dfc.n, dfc.dU),
      b("mesa", dfc.aa, dfc.t, dfc.ki);

      public static final Codec<ekp.a> c = azu.a(ekp.a::values);
      private static final IntFunction<ekp.a> d = axp.a(Enum::ordinal, values(), axp.a.a);
      private final String e;
      private final dsd f;
      private final dsd g;
      private final dsd h;

      private a(final String $$0, final dfa $$1, final dfa $$2, final dfa $$3) {
         this.e = $$0;
         this.f = $$1.o();
         this.g = $$2.o();
         this.h = $$3.o();
      }

      public String a() {
         return this.e;
      }

      public static ekp.a a(int $$0) {
         return d.apply($$0);
      }

      public dsd b() {
         return this.f;
      }

      public dsd d() {
         return this.g;
      }

      public dsd e() {
         return this.h;
      }

      @Override
      public String c() {
         return this.e;
      }
   }
}
