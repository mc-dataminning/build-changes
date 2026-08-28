import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.function.IntFunction;

public class epq extends enl {
   public static final MapCodec<epq> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(a($$0), epq.a.c.fieldOf("mineshaft_type").forGetter($$0x -> $$0x.e)).apply($$0, epq::new)
   );
   private final epq.a e;

   public epq(enl.c $$0, epq.a $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   public Optional<enl.b> a(enl.a $$0) {
      $$0.f().j();
      dfn $$1 = $$0.h();
      ji $$2 = new ji($$1.b(), 50, $$1.e());
      eod $$3 = new eod();
      int $$4 = this.a($$3, $$0);
      return Optional.of(new enl.b($$2.b(0, $$4, 0), Either.right($$3)));
   }

   private int a(eod $$0, enl.a $$1) {
      dfn $$2 = $$1.h();
      edq $$3 = $$1.f();
      dys $$4 = $$1.b();
      epp.d $$5 = new epp.d(0, $$3, $$2.a(2), $$2.b(2), this.e);
      $$0.a($$5);
      $$5.a($$5, $$0, $$3);
      int $$6 = $$4.f();
      if (this.e == epq.a.b) {
         ji $$7 = $$0.d().g();
         int $$8 = $$4.a($$7.u(), $$7.w(), ecr.a.a, $$1.i(), $$1.d());
         int $$9 = $$8 <= $$6 ? $$6 : ayz.b($$3, $$6, $$8);
         int $$10 = $$9 - $$7.v();
         $$0.a($$10);
         return $$10;
      } else {
         return $$0.a($$6, $$4.g(), $$3, 10);
      }
   }

   @Override
   public enu<?> e() {
      return enu.h;
   }

   public static enum a implements azv {
      a("normal", djn.X, djn.n, djn.eh),
      b("mesa", djn.ad, djn.t, djn.kI);

      public static final Codec<epq.a> c = azv.a(epq.a::values);
      private static final IntFunction<epq.a> d = axq.a(Enum::ordinal, values(), axq.a.a);
      private final String e;
      private final dww f;
      private final dww g;
      private final dww h;

      private a(final String $$0, final djl $$1, final djl $$2, final djl $$3) {
         this.e = $$0;
         this.f = $$1.m();
         this.g = $$2.m();
         this.h = $$3.m();
      }

      public String a() {
         return this.e;
      }

      public static epq.a a(int $$0) {
         return d.apply($$0);
      }

      public dww b() {
         return this.f;
      }

      public dww d() {
         return this.g;
      }

      public dww e() {
         return this.h;
      }

      @Override
      public String c() {
         return this.e;
      }
   }
}
