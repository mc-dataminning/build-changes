import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class cpj implements cpi {
   final coq a;
   final coq b;
   final coq c;
   final clo d;

   public cpj(coq $$0, coq $$1, coq $$2, clo $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   @Override
   public boolean a(biu $$0, csf $$1) {
      return this.a.a($$0.a(0)) && this.b.a($$0.a(1)) && this.c.a($$0.a(2));
   }

   @Override
   public clo a(biu $$0, it $$1) {
      clo $$2 = this.d.p();
      sd $$3 = $$0.a(1).v();
      if ($$3 != null) {
         $$2.c($$3.h());
      }

      return $$2;
   }

   @Override
   public clo a(it $$0) {
      return this.d;
   }

   @Override
   public boolean a(clo $$0) {
      return this.a.a($$0);
   }

   @Override
   public boolean b(clo $$0) {
      return this.b.a($$0);
   }

   @Override
   public boolean c(clo $$0) {
      return this.c.a($$0);
   }

   @Override
   public cox<?> as_() {
      return cox.u;
   }

   @Override
   public boolean i() {
      return Stream.of(this.a, this.b, this.c).anyMatch(coq::c);
   }

   public static class a implements cox<cpj> {
      private static final Codec<cpj> x = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  coq.b.fieldOf("template").forGetter($$0x -> $$0x.a),
                  coq.b.fieldOf("base").forGetter($$0x -> $$0x.b),
                  coq.b.fieldOf("addition").forGetter($$0x -> $$0x.c),
                  coj.a.fieldOf("result").forGetter($$0x -> $$0x.d)
               )
               .apply($$0, cpj::new)
      );

      @Override
      public Codec<cpj> a() {
         return x;
      }

      public cpj b(ty $$0) {
         coq $$1 = coq.b($$0);
         coq $$2 = coq.b($$0);
         coq $$3 = coq.b($$0);
         clo $$4 = $$0.r();
         return new cpj($$1, $$2, $$3, $$4);
      }

      public void a(ty $$0, cpj $$1) {
         $$1.a.a($$0);
         $$1.b.a($$0);
         $$1.c.a($$0);
         $$0.a($$1.d);
      }
   }
}
