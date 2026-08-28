import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.function.IntFunction;

public class ekn extends eij {
   public static final MapCodec<ekn> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(a($$0), ekn.a.c.fieldOf("mineshaft_type").forGetter($$0x -> $$0x.e)).apply($$0, ekn::new)
   );
   private final ekn.a e;

   public ekn(eij.c $$0, ekn.a $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   public Optional<eij.b> a(eij.a $$0) {
      $$0.f().j();
      dbe $$1 = $$0.h();
      iz $$2 = new iz($$1.b(), 50, $$1.e());
      ejb $$3 = new ejb();
      int $$4 = this.a($$3, $$0);
      return Optional.of(new eij.b($$2.b(0, $$4, 0), Either.right($$3)));
   }

   private int a(ejb $$0, eij.a $$1) {
      dbe $$2 = $$1.h();
      dys $$3 = $$1.f();
      dty $$4 = $$1.b();
      ekm.d $$5 = new ekm.d(0, $$3, $$2.a(2), $$2.b(2), this.e);
      $$0.a($$5);
      $$5.a($$5, $$0, $$3);
      int $$6 = $$4.f();
      if (this.e == ekn.a.b) {
         iz $$7 = $$0.d().g();
         int $$8 = $$4.a($$7.u(), $$7.w(), dxt.a.a, $$1.i(), $$1.d());
         int $$9 = $$8 <= $$6 ? $$6 : ayy.b($$3, $$6, $$8);
         int $$10 = $$9 - $$7.v();
         $$0.a($$10);
         return $$10;
      } else {
         return $$0.a($$6, $$4.g(), $$3, 10);
      }
   }

   @Override
   public eis<?> e() {
      return eis.h;
   }

   public static enum a implements azt {
      a("normal", dfa.U, dfa.n, dfa.dU),
      b("mesa", dfa.aa, dfa.t, dfa.ki);

      public static final Codec<ekn.a> c = azt.a(ekn.a::values);
      private static final IntFunction<ekn.a> d = axo.a(Enum::ordinal, values(), axo.a.a);
      private final String e;
      private final dsb f;
      private final dsb g;
      private final dsb h;

      private a(final String $$0, final dey $$1, final dey $$2, final dey $$3) {
         this.e = $$0;
         this.f = $$1.o();
         this.g = $$2.o();
         this.h = $$3.o();
      }

      public String a() {
         return this.e;
      }

      public static ekn.a a(int $$0) {
         return d.apply($$0);
      }

      public dsb b() {
         return this.f;
      }

      public dsb d() {
         return this.g;
      }

      public dsb e() {
         return this.h;
      }

      @Override
      public String c() {
         return this.e;
      }
   }
}
