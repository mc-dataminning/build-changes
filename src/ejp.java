import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.function.IntFunction;

public class ejp extends ehl {
   public static final MapCodec<ejp> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(a($$0), ejp.a.c.fieldOf("mineshaft_type").forGetter($$0x -> $$0x.e)).apply($$0, ejp::new)
   );
   private final ejp.a e;

   public ejp(ehl.c $$0, ejp.a $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   public Optional<ehl.b> a(ehl.a $$0) {
      $$0.f().j();
      dag $$1 = $$0.h();
      io $$2 = new io($$1.b(), 50, $$1.e());
      eid $$3 = new eid();
      int $$4 = this.a($$3, $$0);
      return Optional.of(new ehl.b($$2.b(0, $$4, 0), Either.right($$3)));
   }

   private int a(eid $$0, ehl.a $$1) {
      dag $$2 = $$1.h();
      dxu $$3 = $$1.f();
      dta $$4 = $$1.b();
      ejo.d $$5 = new ejo.d(0, $$3, $$2.a(2), $$2.b(2), this.e);
      $$0.a($$5);
      $$5.a($$5, $$0, $$3);
      int $$6 = $$4.e();
      if (this.e == ejp.a.b) {
         io $$7 = $$0.d().g();
         int $$8 = $$4.a($$7.u(), $$7.w(), dwv.a.a, $$1.i(), $$1.d());
         int $$9 = $$8 <= $$6 ? $$6 : ayf.b($$3, $$6, $$8);
         int $$10 = $$9 - $$7.v();
         $$0.a($$10);
         return $$10;
      } else {
         return $$0.a($$6, $$4.f(), $$3, 10);
      }
   }

   @Override
   public ehu<?> e() {
      return ehu.h;
   }

   public static enum a implements ayz {
      a("normal", dec.U, dec.n, dec.dU),
      b("mesa", dec.aa, dec.t, dec.ki);

      public static final Codec<ejp.a> c = ayz.a(ejp.a::values);
      private static final IntFunction<ejp.a> d = aww.a(Enum::ordinal, values(), aww.a.a);
      private final String e;
      private final drd f;
      private final drd g;
      private final drd h;

      private a(String $$0, dea $$1, dea $$2, dea $$3) {
         this.e = $$0;
         this.f = $$1.n();
         this.g = $$2.n();
         this.h = $$3.n();
      }

      public String a() {
         return this.e;
      }

      public static ejp.a a(int $$0) {
         return d.apply($$0);
      }

      public drd b() {
         return this.f;
      }

      public drd d() {
         return this.g;
      }

      public drd e() {
         return this.h;
      }

      @Override
      public String c() {
         return this.e;
      }
   }
}
