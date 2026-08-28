import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.function.IntFunction;

public class eku extends eiq {
   public static final MapCodec<eku> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(a($$0), eku.a.c.fieldOf("mineshaft_type").forGetter($$0x -> $$0x.e)).apply($$0, eku::new)
   );
   private final eku.a e;

   public eku(eiq.c $$0, eku.a $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   public Optional<eiq.b> a(eiq.a $$0) {
      $$0.f().j();
      dbk $$1 = $$0.h();
      ja $$2 = new ja($$1.b(), 50, $$1.e());
      eji $$3 = new eji();
      int $$4 = this.a($$3, $$0);
      return Optional.of(new eiq.b($$2.b(0, $$4, 0), Either.right($$3)));
   }

   private int a(eji $$0, eiq.a $$1) {
      dbk $$2 = $$1.h();
      dyy $$3 = $$1.f();
      due $$4 = $$1.b();
      ekt.d $$5 = new ekt.d(0, $$3, $$2.a(2), $$2.b(2), this.e);
      $$0.a($$5);
      $$5.a($$5, $$0, $$3);
      int $$6 = $$4.f();
      if (this.e == eku.a.b) {
         ja $$7 = $$0.d().g();
         int $$8 = $$4.a($$7.u(), $$7.w(), dxz.a.a, $$1.i(), $$1.d());
         int $$9 = $$8 <= $$6 ? $$6 : aye.b($$3, $$6, $$8);
         int $$10 = $$9 - $$7.v();
         $$0.a($$10);
         return $$10;
      } else {
         return $$0.a($$6, $$4.g(), $$3, 10);
      }
   }

   @Override
   public eiz<?> e() {
      return eiz.h;
   }

   public static enum a implements ayz {
      a("normal", dfh.U, dfh.n, dfh.dU),
      b("mesa", dfh.aa, dfh.t, dfh.ki);

      public static final Codec<eku.a> c = ayz.a(eku.a::values);
      private static final IntFunction<eku.a> d = awu.a(Enum::ordinal, values(), awu.a.a);
      private final String e;
      private final dsh f;
      private final dsh g;
      private final dsh h;

      private a(final String $$0, final dff $$1, final dff $$2, final dff $$3) {
         this.e = $$0;
         this.f = $$1.o();
         this.g = $$2.o();
         this.h = $$3.o();
      }

      public String a() {
         return this.e;
      }

      public static eku.a a(int $$0) {
         return d.apply($$0);
      }

      public dsh b() {
         return this.f;
      }

      public dsh d() {
         return this.g;
      }

      public dsh e() {
         return this.h;
      }

      @Override
      public String c() {
         return this.e;
      }
   }
}
