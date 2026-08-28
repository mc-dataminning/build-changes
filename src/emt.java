import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.function.IntFunction;

public class emt extends eko {
   public static final MapCodec<emt> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(a($$0), emt.a.c.fieldOf("mineshaft_type").forGetter($$0x -> $$0x.e)).apply($$0, emt::new)
   );
   private final emt.a e;

   public emt(eko.c $$0, emt.a $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   public Optional<eko.b> a(eko.a $$0) {
      $$0.f().j();
      dcy $$1 = $$0.h();
      je $$2 = new je($$1.b(), 50, $$1.e());
      elg $$3 = new elg();
      int $$4 = this.a($$3, $$0);
      return Optional.of(new eko.b($$2.b(0, $$4, 0), Either.right($$3)));
   }

   private int a(elg $$0, eko.a $$1) {
      dcy $$2 = $$1.h();
      eav $$3 = $$1.f();
      dvx $$4 = $$1.b();
      ems.d $$5 = new ems.d(0, $$3, $$2.a(2), $$2.b(2), this.e);
      $$0.a($$5);
      $$5.a($$5, $$0, $$3);
      int $$6 = $$4.f();
      if (this.e == emt.a.b) {
         je $$7 = $$0.d().g();
         int $$8 = $$4.a($$7.u(), $$7.w(), dzw.a.a, $$1.i(), $$1.d());
         int $$9 = $$8 <= $$6 ? $$6 : azc.b($$3, $$6, $$8);
         int $$10 = $$9 - $$7.v();
         $$0.a($$10);
         return $$10;
      } else {
         return $$0.a($$6, $$4.g(), $$3, 10);
      }
   }

   @Override
   public ekx<?> e() {
      return ekx.h;
   }

   public static enum a implements azy {
      a("normal", dgx.U, dgx.n, dgx.dU),
      b("mesa", dgx.aa, dgx.t, dgx.ki);

      public static final Codec<emt.a> c = azy.a(emt.a::values);
      private static final IntFunction<emt.a> d = axt.a(Enum::ordinal, values(), axt.a.a);
      private final String e;
      private final dua f;
      private final dua g;
      private final dua h;

      private a(final String $$0, final dgv $$1, final dgv $$2, final dgv $$3) {
         this.e = $$0;
         this.f = $$1.o();
         this.g = $$2.o();
         this.h = $$3.o();
      }

      public String a() {
         return this.e;
      }

      public static emt.a a(int $$0) {
         return d.apply($$0);
      }

      public dua b() {
         return this.f;
      }

      public dua d() {
         return this.g;
      }

      public dua e() {
         return this.h;
      }

      @Override
      public String c() {
         return this.e;
      }
   }
}
