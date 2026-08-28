import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.function.IntFunction;

public class eon extends emi {
   public static final MapCodec<eon> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(a($$0), eon.a.c.fieldOf("mineshaft_type").forGetter($$0x -> $$0x.e)).apply($$0, eon::new)
   );
   private final eon.a e;

   public eon(emi.c $$0, eon.a $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   public Optional<emi.b> a(emi.a $$0) {
      $$0.f().j();
      des $$1 = $$0.h();
      jh $$2 = new jh($$1.b(), 50, $$1.e());
      ena $$3 = new ena();
      int $$4 = this.a($$3, $$0);
      return Optional.of(new emi.b($$2.b(0, $$4, 0), Either.right($$3)));
   }

   private int a(ena $$0, emi.a $$1) {
      des $$2 = $$1.h();
      ecp $$3 = $$1.f();
      dxr $$4 = $$1.b();
      eom.d $$5 = new eom.d(0, $$3, $$2.a(2), $$2.b(2), this.e);
      $$0.a($$5);
      $$5.a($$5, $$0, $$3);
      int $$6 = $$4.f();
      if (this.e == eon.a.b) {
         jh $$7 = $$0.d().g();
         int $$8 = $$4.a($$7.u(), $$7.w(), ebq.a.a, $$1.i(), $$1.d());
         int $$9 = $$8 <= $$6 ? $$6 : azm.b($$3, $$6, $$8);
         int $$10 = $$9 - $$7.v();
         $$0.a($$10);
         return $$10;
      } else {
         return $$0.a($$6, $$4.g(), $$3, 10);
      }
   }

   @Override
   public emr<?> e() {
      return emr.h;
   }

   public static enum a implements bai {
      a("normal", dis.U, dis.n, dis.dU),
      b("mesa", dis.aa, dis.t, dis.ki);

      public static final Codec<eon.a> c = bai.a(eon.a::values);
      private static final IntFunction<eon.a> d = ayd.a(Enum::ordinal, values(), ayd.a.a);
      private final String e;
      private final dvv f;
      private final dvv g;
      private final dvv h;

      private a(final String $$0, final diq $$1, final diq $$2, final diq $$3) {
         this.e = $$0;
         this.f = $$1.m();
         this.g = $$2.m();
         this.h = $$3.m();
      }

      public String a() {
         return this.e;
      }

      public static eon.a a(int $$0) {
         return d.apply($$0);
      }

      public dvv b() {
         return this.f;
      }

      public dvv d() {
         return this.g;
      }

      public dvv e() {
         return this.h;
      }

      @Override
      public String c() {
         return this.e;
      }
   }
}
