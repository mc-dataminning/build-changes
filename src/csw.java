import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class csw implements csv {
   final csc a;
   final csc b;
   final csc c;
   final cpd d;

   public csw(csc $$0, csc $$1, csc $$2, cpd $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   @Override
   public boolean a(blp $$0, cvr $$1) {
      return this.a.a($$0.a(0)) && this.b.a($$0.a(1)) && this.c.a($$0.a(2));
   }

   @Override
   public cpd a(blp $$0, iw $$1) {
      cpd $$2 = this.d.q();
      sw $$3 = $$0.a(1).w();
      if ($$3 != null) {
         $$2.c($$3.h());
      }

      return $$2;
   }

   @Override
   public cpd a(iw $$0) {
      return this.d;
   }

   @Override
   public boolean a(cpd $$0) {
      return this.a.a($$0);
   }

   @Override
   public boolean b(cpd $$0) {
      return this.b.a($$0);
   }

   @Override
   public boolean c(cpd $$0) {
      return this.c.a($$0);
   }

   @Override
   public csj<?> at_() {
      return csj.u;
   }

   @Override
   public boolean i() {
      return Stream.of(this.a, this.b, this.c).anyMatch(csc::c);
   }

   public static class a implements csj<csw> {
      private static final Codec<csw> y = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  csc.c.fieldOf("template").forGetter($$0x -> $$0x.a),
                  csc.c.fieldOf("base").forGetter($$0x -> $$0x.b),
                  csc.c.fieldOf("addition").forGetter($$0x -> $$0x.c),
                  cpd.c.fieldOf("result").forGetter($$0x -> $$0x.d)
               )
               .apply($$0, csw::new)
      );
      public static final xo<vb, csw> x = xo.a(csw.a::a, csw.a::a);

      @Override
      public Codec<csw> a() {
         return y;
      }

      @Override
      public xo<vb, csw> b() {
         return x;
      }

      private static csw a(vb $$0) {
         csc $$1 = csc.b.decode($$0);
         csc $$2 = csc.b.decode($$0);
         csc $$3 = csc.b.decode($$0);
         cpd $$4 = cpd.f.decode($$0);
         return new csw($$1, $$2, $$3, $$4);
      }

      private static void a(vb $$0, csw $$1) {
         csc.b.encode($$0, $$1.a);
         csc.b.encode($$0, $$1.b);
         csc.b.encode($$0, $$1.c);
         cpd.f.encode($$0, $$1.d);
      }
   }
}
