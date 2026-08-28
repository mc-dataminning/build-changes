import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.function.IntFunction;

public class elc extends eix {
   public static final MapCodec<elc> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(a($$0), elc.a.c.fieldOf("mineshaft_type").forGetter($$0x -> $$0x.e)).apply($$0, elc::new)
   );
   private final elc.a e;

   public elc(eix.c $$0, elc.a $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   public Optional<eix.b> a(eix.a $$0) {
      $$0.f().j();
      dbn $$1 = $$0.h();
      ja $$2 = new ja($$1.b(), 50, $$1.e());
      ejp $$3 = new ejp();
      int $$4 = this.a($$3, $$0);
      return Optional.of(new eix.b($$2.b(0, $$4, 0), Either.right($$3)));
   }

   private int a(ejp $$0, eix.a $$1) {
      dbn $$2 = $$1.h();
      dzf $$3 = $$1.f();
      dui $$4 = $$1.b();
      elb.d $$5 = new elb.d(0, $$3, $$2.a(2), $$2.b(2), this.e);
      $$0.a($$5);
      $$5.a($$5, $$0, $$3);
      int $$6 = $$4.f();
      if (this.e == elc.a.b) {
         ja $$7 = $$0.d().g();
         int $$8 = $$4.a($$7.u(), $$7.w(), dyg.a.a, $$1.i(), $$1.d());
         int $$9 = $$8 <= $$6 ? $$6 : ayg.b($$3, $$6, $$8);
         int $$10 = $$9 - $$7.v();
         $$0.a($$10);
         return $$10;
      } else {
         return $$0.a($$6, $$4.g(), $$3, 10);
      }
   }

   @Override
   public ejg<?> e() {
      return ejg.h;
   }

   public static enum a implements azc {
      a("normal", dfk.U, dfk.n, dfk.dU),
      b("mesa", dfk.aa, dfk.t, dfk.ki);

      public static final Codec<elc.a> c = azc.a(elc.a::values);
      private static final IntFunction<elc.a> d = aww.a(Enum::ordinal, values(), aww.a.a);
      private final String e;
      private final dsl f;
      private final dsl g;
      private final dsl h;

      private a(final String $$0, final dfi $$1, final dfi $$2, final dfi $$3) {
         this.e = $$0;
         this.f = $$1.o();
         this.g = $$2.o();
         this.h = $$3.o();
      }

      public String a() {
         return this.e;
      }

      public static elc.a a(int $$0) {
         return d.apply($$0);
      }

      public dsl b() {
         return this.f;
      }

      public dsl d() {
         return this.g;
      }

      public dsl e() {
         return this.h;
      }

      @Override
      public String c() {
         return this.e;
      }
   }
}
