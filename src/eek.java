import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.function.IntFunction;

public class eek extends ecg {
   public static final Codec<eek> d = RecordCodecBuilder.create(
      $$0 -> $$0.group(a($$0), eek.a.c.fieldOf("mineshaft_type").forGetter($$0x -> $$0x.e)).apply($$0, eek::new)
   );
   private final eek.a e;

   public eek(ecg.c $$0, eek.a $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   public Optional<ecg.b> a(ecg.a $$0) {
      $$0.f().j();
      cvl $$1 = $$0.h();
      ib $$2 = new ib($$1.b(), 50, $$1.e());
      ecy $$3 = new ecy();
      int $$4 = this.a($$3, $$0);
      return Optional.of(new ecg.b($$2.b(0, $$4, 0), Either.right($$3)));
   }

   private int a(ecy $$0, ecg.a $$1) {
      cvl $$2 = $$1.h();
      dsp $$3 = $$1.f();
      dob $$4 = $$1.b();
      eej.d $$5 = new eej.d(0, $$3, $$2.a(2), $$2.b(2), this.e);
      $$0.a($$5);
      $$5.a($$5, $$0, $$3);
      int $$6 = $$4.e();
      if (this.e == eek.a.b) {
         ib $$7 = $$0.d().g();
         int $$8 = $$4.a($$7.u(), $$7.w(), drq.a.a, $$1.i(), $$1.d());
         int $$9 = $$8 <= $$6 ? $$6 : awm.b($$3, $$6, $$8);
         int $$10 = $$9 - $$7.v();
         $$0.a($$10);
         return $$10;
      } else {
         return $$0.a($$6, $$4.f(), $$3, 10);
      }
   }

   @Override
   public ecp<?> e() {
      return ecp.h;
   }

   public static enum a implements axg {
      a("normal", czh.U, czh.n, czh.dU),
      b("mesa", czh.aa, czh.t, czh.ki);

      public static final Codec<eek.a> c = axg.a(eek.a::values);
      private static final IntFunction<eek.a> d = ave.a(Enum::ordinal, values(), ave.a.a);
      private final String e;
      private final dme f;
      private final dme g;
      private final dme h;

      private a(String $$0, czf $$1, czf $$2, czf $$3) {
         this.e = $$0;
         this.f = $$1.o();
         this.g = $$2.o();
         this.h = $$3.o();
      }

      public String a() {
         return this.e;
      }

      public static eek.a a(int $$0) {
         return d.apply($$0);
      }

      public dme b() {
         return this.f;
      }

      public dme d() {
         return this.g;
      }

      public dme e() {
         return this.h;
      }

      @Override
      public String c() {
         return this.e;
      }
   }
}
