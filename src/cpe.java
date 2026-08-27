import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class cpe implements cpd {
   final cok a;
   final cok b;
   final cok c;
   final clj d;

   public cpe(cok $$0, cok $$1, cok $$2, clj $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   @Override
   public boolean a(biq $$0, csa $$1) {
      return this.a.a($$0.a(0)) && this.b.a($$0.a(1)) && this.c.a($$0.a(2));
   }

   @Override
   public clj a(biq $$0, ip $$1) {
      clj $$2 = this.d.p();
      rz $$3 = $$0.a(1).v();
      if ($$3 != null) {
         $$2.c($$3.h());
      }

      return $$2;
   }

   @Override
   public clj a(ip $$0) {
      return this.d;
   }

   @Override
   public boolean a(clj $$0) {
      return this.a.a($$0);
   }

   @Override
   public boolean b(clj $$0) {
      return this.b.a($$0);
   }

   @Override
   public boolean c(clj $$0) {
      return this.c.a($$0);
   }

   @Override
   public cos<?> aq_() {
      return cos.u;
   }

   @Override
   public boolean i() {
      return Stream.of(this.a, this.b, this.c).anyMatch(cok::c);
   }

   public static class a implements cos<cpe> {
      private static final Codec<cpe> x = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  cok.b.fieldOf("template").forGetter($$0x -> $$0x.a),
                  cok.b.fieldOf("base").forGetter($$0x -> $$0x.b),
                  cok.b.fieldOf("addition").forGetter($$0x -> $$0x.c),
                  coe.a.fieldOf("result").forGetter($$0x -> $$0x.d)
               )
               .apply($$0, cpe::new)
      );

      @Override
      public Codec<cpe> a() {
         return x;
      }

      public cpe b(tu $$0) {
         cok $$1 = cok.b($$0);
         cok $$2 = cok.b($$0);
         cok $$3 = cok.b($$0);
         clj $$4 = $$0.r();
         return new cpe($$1, $$2, $$3, $$4);
      }

      public void a(tu $$0, cpe $$1) {
         $$1.a.a($$0);
         $$1.b.a($$0);
         $$1.c.a($$0);
         $$0.a($$1.d);
      }
   }
}
