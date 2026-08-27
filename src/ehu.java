import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.function.IntFunction;

public class ehu extends efq {
   public static final Codec<ehu> d = RecordCodecBuilder.create(
      $$0 -> $$0.group(a($$0), ehu.a.c.fieldOf("mineshaft_type").forGetter($$0x -> $$0x.e)).apply($$0, ehu::new)
   );
   private final ehu.a e;

   public ehu(efq.c $$0, ehu.a $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   public Optional<efq.b> a(efq.a $$0) {
      $$0.f().j();
      cyn $$1 = $$0.h();
      id $$2 = new id($$1.b(), 50, $$1.e());
      egi $$3 = new egi();
      int $$4 = this.a($$3, $$0);
      return Optional.of(new efq.b($$2.b(0, $$4, 0), Either.right($$3)));
   }

   private int a(egi $$0, efq.a $$1) {
      cyn $$2 = $$1.h();
      dvz $$3 = $$1.f();
      drf $$4 = $$1.b();
      eht.d $$5 = new eht.d(0, $$3, $$2.a(2), $$2.b(2), this.e);
      $$0.a($$5);
      $$5.a($$5, $$0, $$3);
      int $$6 = $$4.e();
      if (this.e == ehu.a.b) {
         id $$7 = $$0.d().g();
         int $$8 = $$4.a($$7.u(), $$7.w(), dva.a.a, $$1.i(), $$1.d());
         int $$9 = $$8 <= $$6 ? $$6 : axm.b($$3, $$6, $$8);
         int $$10 = $$9 - $$7.v();
         $$0.a($$10);
         return $$10;
      } else {
         return $$0.a($$6, $$4.f(), $$3, 10);
      }
   }

   @Override
   public efz<?> e() {
      return efz.h;
   }

   public static enum a implements ayg {
      a("normal", dcj.U, dcj.n, dcj.dU),
      b("mesa", dcj.aa, dcj.t, dcj.ki);

      public static final Codec<ehu.a> c = ayg.a(ehu.a::values);
      private static final IntFunction<ehu.a> d = awd.a(Enum::ordinal, values(), awd.a.a);
      private final String e;
      private final dpi f;
      private final dpi g;
      private final dpi h;

      private a(String $$0, dch $$1, dch $$2, dch $$3) {
         this.e = $$0;
         this.f = $$1.n();
         this.g = $$2.n();
         this.h = $$3.n();
      }

      public String a() {
         return this.e;
      }

      public static ehu.a a(int $$0) {
         return d.apply($$0);
      }

      public dpi b() {
         return this.f;
      }

      public dpi d() {
         return this.g;
      }

      public dpi e() {
         return this.h;
      }

      @Override
      public String c() {
         return this.e;
      }
   }
}
