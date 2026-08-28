import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.function.IntFunction;

public class ekm extends eii {
   public static final MapCodec<ekm> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(a($$0), ekm.a.c.fieldOf("mineshaft_type").forGetter($$0x -> $$0x.e)).apply($$0, ekm::new)
   );
   private final ekm.a e;

   public ekm(eii.c $$0, ekm.a $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   public Optional<eii.b> a(eii.a $$0) {
      $$0.f().j();
      dbd $$1 = $$0.h();
      iz $$2 = new iz($$1.b(), 50, $$1.e());
      eja $$3 = new eja();
      int $$4 = this.a($$3, $$0);
      return Optional.of(new eii.b($$2.b(0, $$4, 0), Either.right($$3)));
   }

   private int a(eja $$0, eii.a $$1) {
      dbd $$2 = $$1.h();
      dyr $$3 = $$1.f();
      dtx $$4 = $$1.b();
      ekl.d $$5 = new ekl.d(0, $$3, $$2.a(2), $$2.b(2), this.e);
      $$0.a($$5);
      $$5.a($$5, $$0, $$3);
      int $$6 = $$4.f();
      if (this.e == ekm.a.b) {
         iz $$7 = $$0.d().g();
         int $$8 = $$4.a($$7.u(), $$7.w(), dxs.a.a, $$1.i(), $$1.d());
         int $$9 = $$8 <= $$6 ? $$6 : ayx.b($$3, $$6, $$8);
         int $$10 = $$9 - $$7.v();
         $$0.a($$10);
         return $$10;
      } else {
         return $$0.a($$6, $$4.g(), $$3, 10);
      }
   }

   @Override
   public eir<?> e() {
      return eir.h;
   }

   public static enum a implements azs {
      a("normal", dez.U, dez.n, dez.dU),
      b("mesa", dez.aa, dez.t, dez.ki);

      public static final Codec<ekm.a> c = azs.a(ekm.a::values);
      private static final IntFunction<ekm.a> d = axo.a(Enum::ordinal, values(), axo.a.a);
      private final String e;
      private final dsa f;
      private final dsa g;
      private final dsa h;

      private a(final String $$0, final dex $$1, final dex $$2, final dex $$3) {
         this.e = $$0;
         this.f = $$1.o();
         this.g = $$2.o();
         this.h = $$3.o();
      }

      public String a() {
         return this.e;
      }

      public static ekm.a a(int $$0) {
         return d.apply($$0);
      }

      public dsa b() {
         return this.f;
      }

      public dsa d() {
         return this.g;
      }

      public dsa e() {
         return this.h;
      }

      @Override
      public String c() {
         return this.e;
      }
   }
}
