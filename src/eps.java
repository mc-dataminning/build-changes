import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.function.IntFunction;

public class eps extends enn {
   public static final MapCodec<eps> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(a($$0), eps.a.c.fieldOf("mineshaft_type").forGetter($$0x -> $$0x.e)).apply($$0, eps::new)
   );
   private final eps.a e;

   public eps(enn.c $$0, eps.a $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   public Optional<enn.b> a(enn.a $$0) {
      $$0.f().j();
      dfp $$1 = $$0.h();
      ji $$2 = new ji($$1.b(), 50, $$1.e());
      eof $$3 = new eof();
      int $$4 = this.a($$3, $$0);
      return Optional.of(new enn.b($$2.b(0, $$4, 0), Either.right($$3)));
   }

   private int a(eof $$0, enn.a $$1) {
      dfp $$2 = $$1.h();
      eds $$3 = $$1.f();
      dyu $$4 = $$1.b();
      epr.d $$5 = new epr.d(0, $$3, $$2.a(2), $$2.b(2), this.e);
      $$0.a($$5);
      $$5.a($$5, $$0, $$3);
      int $$6 = $$4.f();
      if (this.e == eps.a.b) {
         ji $$7 = $$0.d().g();
         int $$8 = $$4.a($$7.u(), $$7.w(), ect.a.a, $$1.i(), $$1.d());
         int $$9 = $$8 <= $$6 ? $$6 : ayz.b($$3, $$6, $$8);
         int $$10 = $$9 - $$7.v();
         $$0.a($$10);
         return $$10;
      } else {
         return $$0.a($$6, $$4.g(), $$3, 10);
      }
   }

   @Override
   public enw<?> e() {
      return enw.h;
   }

   public static enum a implements azv {
      a("normal", djp.X, djp.n, djp.eh),
      b("mesa", djp.ad, djp.t, djp.kI);

      public static final Codec<eps.a> c = azv.a(eps.a::values);
      private static final IntFunction<eps.a> d = axq.a(Enum::ordinal, values(), axq.a.a);
      private final String e;
      private final dwy f;
      private final dwy g;
      private final dwy h;

      private a(final String $$0, final djn $$1, final djn $$2, final djn $$3) {
         this.e = $$0;
         this.f = $$1.m();
         this.g = $$2.m();
         this.h = $$3.m();
      }

      public String a() {
         return this.e;
      }

      public static eps.a a(int $$0) {
         return d.apply($$0);
      }

      public dwy b() {
         return this.f;
      }

      public dwy d() {
         return this.g;
      }

      public dwy e() {
         return this.h;
      }

      @Override
      public String c() {
         return this.e;
      }
   }
}
