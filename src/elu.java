import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.function.IntFunction;

public class elu extends ejp {
   public static final MapCodec<elu> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(a($$0), elu.a.c.fieldOf("mineshaft_type").forGetter($$0x -> $$0x.e)).apply($$0, elu::new)
   );
   private final elu.a e;

   public elu(ejp.c $$0, elu.a $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   public Optional<ejp.b> a(ejp.a $$0) {
      $$0.f().j();
      dcd $$1 = $$0.h();
      jd $$2 = new jd($$1.b(), 50, $$1.e());
      ekh $$3 = new ekh();
      int $$4 = this.a($$3, $$0);
      return Optional.of(new ejp.b($$2.b(0, $$4, 0), Either.right($$3)));
   }

   private int a(ekh $$0, ejp.a $$1) {
      dcd $$2 = $$1.h();
      dzx $$3 = $$1.f();
      duz $$4 = $$1.b();
      elt.d $$5 = new elt.d(0, $$3, $$2.a(2), $$2.b(2), this.e);
      $$0.a($$5);
      $$5.a($$5, $$0, $$3);
      int $$6 = $$4.f();
      if (this.e == elu.a.b) {
         jd $$7 = $$0.d().g();
         int $$8 = $$4.a($$7.u(), $$7.w(), dyy.a.a, $$1.i(), $$1.d());
         int $$9 = $$8 <= $$6 ? $$6 : ayo.b($$3, $$6, $$8);
         int $$10 = $$9 - $$7.v();
         $$0.a($$10);
         return $$10;
      } else {
         return $$0.a($$6, $$4.g(), $$3, 10);
      }
   }

   @Override
   public ejy<?> e() {
      return ejy.h;
   }

   public static enum a implements azk {
      a("normal", dga.U, dga.n, dga.dU),
      b("mesa", dga.aa, dga.t, dga.ki);

      public static final Codec<elu.a> c = azk.a(elu.a::values);
      private static final IntFunction<elu.a> d = axe.a(Enum::ordinal, values(), axe.a.a);
      private final String e;
      private final dtc f;
      private final dtc g;
      private final dtc h;

      private a(final String $$0, final dfy $$1, final dfy $$2, final dfy $$3) {
         this.e = $$0;
         this.f = $$1.o();
         this.g = $$2.o();
         this.h = $$3.o();
      }

      public String a() {
         return this.e;
      }

      public static elu.a a(int $$0) {
         return d.apply($$0);
      }

      public dtc b() {
         return this.f;
      }

      public dtc d() {
         return this.g;
      }

      public dtc e() {
         return this.h;
      }

      @Override
      public String c() {
         return this.e;
      }
   }
}
