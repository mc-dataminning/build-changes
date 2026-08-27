import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class cwj implements cwi {
   final cvp a;
   final cvp b;
   final cvp c;
   final crs d;

   public cwj(cvp $$0, cvp $$1, cvp $$2, crs $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   @Override
   public boolean a(bny $$0, czg $$1) {
      return this.a.a($$0.a(0)) && this.b.a($$0.a(1)) && this.c.a($$0.a(2));
   }

   @Override
   public crs a(bny $$0, jb $$1) {
      return $$0.a(1).a(this.d.f(), this.d.G());
   }

   @Override
   public crs a(jb $$0) {
      return this.d;
   }

   @Override
   public boolean a(crs $$0) {
      return this.a.a($$0);
   }

   @Override
   public boolean b(crs $$0) {
      return this.b.a($$0);
   }

   @Override
   public boolean c(crs $$0) {
      return this.c.a($$0);
   }

   @Override
   public cvw<?> ao_() {
      return cvw.u;
   }

   @Override
   public boolean i() {
      return Stream.of(this.a, this.b, this.c).anyMatch(cvp::c);
   }

   public static class a implements cvw<cwj> {
      private static final Codec<cwj> y = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  cvp.c.fieldOf("template").forGetter($$0x -> $$0x.a),
                  cvp.c.fieldOf("base").forGetter($$0x -> $$0x.b),
                  cvp.c.fieldOf("addition").forGetter($$0x -> $$0x.c),
                  crs.a.fieldOf("result").forGetter($$0x -> $$0x.d)
               )
               .apply($$0, cwj::new)
      );
      public static final yg<vt, cwj> x = yg.a(cwj.a::a, cwj.a::a);

      @Override
      public Codec<cwj> a() {
         return y;
      }

      @Override
      public yg<vt, cwj> b() {
         return x;
      }

      private static cwj a(vt $$0) {
         cvp $$1 = cvp.b.decode($$0);
         cvp $$2 = cvp.b.decode($$0);
         cvp $$3 = cvp.b.decode($$0);
         crs $$4 = crs.f.decode($$0);
         return new cwj($$1, $$2, $$3, $$4);
      }

      private static void a(vt $$0, cwj $$1) {
         cvp.b.encode($$0, $$1.a);
         cvp.b.encode($$0, $$1.b);
         cvp.b.encode($$0, $$1.c);
         crs.f.encode($$0, $$1.d);
      }
   }
}
