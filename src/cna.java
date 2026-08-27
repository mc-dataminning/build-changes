import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class cna implements cmz {
   final cmi a;
   final cmi b;
   final cmi c;
   final cjh d;

   public cna(cmi $$0, cmi $$1, cmi $$2, cjh $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   @Override
   public boolean a(bgt $$0, cpx $$1) {
      return this.a.a($$0.a(0)) && this.b.a($$0.a(1)) && this.c.a($$0.a(2));
   }

   @Override
   public cjh a(bgt $$0, hu $$1) {
      cjh $$2 = this.d.p();
      qy $$3 = $$0.a(1).v();
      if ($$3 != null) {
         $$2.c($$3.h());
      }

      return $$2;
   }

   @Override
   public cjh a(hu $$0) {
      return this.d;
   }

   @Override
   public boolean a(cjh $$0) {
      return this.a.a($$0);
   }

   @Override
   public boolean b(cjh $$0) {
      return this.b.a($$0);
   }

   @Override
   public boolean c(cjh $$0) {
      return this.c.a($$0);
   }

   @Override
   public cmo<?> an_() {
      return cmo.u;
   }

   @Override
   public boolean i() {
      return Stream.of(this.a, this.b, this.c).anyMatch(cmi::c);
   }

   public static class a implements cmo<cna> {
      private static final Codec<cna> x = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  cmi.b.fieldOf("template").forGetter($$0x -> $$0x.a),
                  cmi.b.fieldOf("base").forGetter($$0x -> $$0x.b),
                  cmi.b.fieldOf("addition").forGetter($$0x -> $$0x.c),
                  cmc.a.fieldOf("result").forGetter($$0x -> $$0x.d)
               )
               .apply($$0, cna::new)
      );

      @Override
      public Codec<cna> a() {
         return x;
      }

      public cna b(sq $$0) {
         cmi $$1 = cmi.b($$0);
         cmi $$2 = cmi.b($$0);
         cmi $$3 = cmi.b($$0);
         cjh $$4 = $$0.q();
         return new cna($$1, $$2, $$3, $$4);
      }

      public void a(sq $$0, cna $$1) {
         $$1.a.a($$0);
         $$1.b.a($$0);
         $$1.c.a($$0);
         $$0.a($$1.d);
      }
   }
}
