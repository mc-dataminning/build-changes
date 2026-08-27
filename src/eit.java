import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.function.IntFunction;

public class eit extends egp {
   public static final Codec<eit> d = RecordCodecBuilder.create(
      $$0 -> $$0.group(a($$0), eit.a.c.fieldOf("mineshaft_type").forGetter($$0x -> $$0x.e)).apply($$0, eit::new)
   );
   private final eit.a e;

   public eit(egp.c $$0, eit.a $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   public Optional<egp.b> a(egp.a $$0) {
      $$0.f().j();
      czk $$1 = $$0.h();
      in $$2 = new in($$1.b(), 50, $$1.e());
      ehh $$3 = new ehh();
      int $$4 = this.a($$3, $$0);
      return Optional.of(new egp.b($$2.b(0, $$4, 0), Either.right($$3)));
   }

   private int a(ehh $$0, egp.a $$1) {
      czk $$2 = $$1.h();
      dwy $$3 = $$1.f();
      dse $$4 = $$1.b();
      eis.d $$5 = new eis.d(0, $$3, $$2.a(2), $$2.b(2), this.e);
      $$0.a($$5);
      $$5.a($$5, $$0, $$3);
      int $$6 = $$4.e();
      if (this.e == eit.a.b) {
         in $$7 = $$0.d().g();
         int $$8 = $$4.a($$7.u(), $$7.w(), dvz.a.a, $$1.i(), $$1.d());
         int $$9 = $$8 <= $$6 ? $$6 : axz.b($$3, $$6, $$8);
         int $$10 = $$9 - $$7.v();
         $$0.a($$10);
         return $$10;
      } else {
         return $$0.a($$6, $$4.f(), $$3, 10);
      }
   }

   @Override
   public egy<?> e() {
      return egy.h;
   }

   public static enum a implements ayt {
      a("normal", ddg.U, ddg.n, ddg.dU),
      b("mesa", ddg.aa, ddg.t, ddg.ki);

      public static final Codec<eit.a> c = ayt.a(eit.a::values);
      private static final IntFunction<eit.a> d = awq.a(Enum::ordinal, values(), awq.a.a);
      private final String e;
      private final dqh f;
      private final dqh g;
      private final dqh h;

      private a(String $$0, dde $$1, dde $$2, dde $$3) {
         this.e = $$0;
         this.f = $$1.n();
         this.g = $$2.n();
         this.h = $$3.n();
      }

      public String a() {
         return this.e;
      }

      public static eit.a a(int $$0) {
         return d.apply($$0);
      }

      public dqh b() {
         return this.f;
      }

      public dqh d() {
         return this.g;
      }

      public dqh e() {
         return this.h;
      }

      @Override
      public String c() {
         return this.e;
      }
   }
}
