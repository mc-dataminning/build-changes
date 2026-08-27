import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class cwa implements cvz {
   final cvg a;
   final cvg b;
   final cvg c;
   final crj d;

   public cwa(cvg $$0, cvg $$1, cvg $$2, crj $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   @Override
   public boolean a(bnt $$0, cyx $$1) {
      return this.a.a($$0.a(0)) && this.b.a($$0.a(1)) && this.c.a($$0.a(2));
   }

   @Override
   public crj a(bnt $$0, iz $$1) {
      return $$0.a(1).a(this.d.f(), this.d.G());
   }

   @Override
   public crj a(iz $$0) {
      return this.d;
   }

   @Override
   public boolean a(crj $$0) {
      return this.a.a($$0);
   }

   @Override
   public boolean b(crj $$0) {
      return this.b.a($$0);
   }

   @Override
   public boolean c(crj $$0) {
      return this.c.a($$0);
   }

   @Override
   public cvn<?> ap_() {
      return cvn.u;
   }

   @Override
   public boolean i() {
      return Stream.of(this.a, this.b, this.c).anyMatch(cvg::c);
   }

   public static class a implements cvn<cwa> {
      private static final Codec<cwa> y = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  cvg.c.fieldOf("template").forGetter($$0x -> $$0x.a),
                  cvg.c.fieldOf("base").forGetter($$0x -> $$0x.b),
                  cvg.c.fieldOf("addition").forGetter($$0x -> $$0x.c),
                  crj.d.fieldOf("result").forGetter($$0x -> $$0x.d)
               )
               .apply($$0, cwa::new)
      );
      public static final ye<vr, cwa> x = ye.a(cwa.a::a, cwa.a::a);

      @Override
      public Codec<cwa> a() {
         return y;
      }

      @Override
      public ye<vr, cwa> b() {
         return x;
      }

      private static cwa a(vr $$0) {
         cvg $$1 = cvg.b.decode($$0);
         cvg $$2 = cvg.b.decode($$0);
         cvg $$3 = cvg.b.decode($$0);
         crj $$4 = crj.f.decode($$0);
         return new cwa($$1, $$2, $$3, $$4);
      }

      private static void a(vr $$0, cwa $$1) {
         cvg.b.encode($$0, $$1.a);
         cvg.b.encode($$0, $$1.b);
         cvg.b.encode($$0, $$1.c);
         crj.f.encode($$0, $$1.d);
      }
   }
}
