import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class cwx implements cww {
   final cwd a;
   final cwd b;
   final cwd c;
   final csd d;

   public cwx(cwd $$0, cwd $$1, cwd $$2, csd $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   @Override
   public boolean a(boj $$0, czu $$1) {
      return this.a.a($$0.a(0)) && this.b.a($$0.a(1)) && this.c.a($$0.a(2));
   }

   @Override
   public csd a(boj $$0, jj $$1) {
      return $$0.a(1).a(this.d.f(), this.d.G());
   }

   @Override
   public csd a(jj $$0) {
      return this.d;
   }

   @Override
   public boolean a(csd $$0) {
      return this.a.a($$0);
   }

   @Override
   public boolean b(csd $$0) {
      return this.b.a($$0);
   }

   @Override
   public boolean c(csd $$0) {
      return this.c.a($$0);
   }

   @Override
   public cwk<?> ao_() {
      return cwk.u;
   }

   @Override
   public boolean i() {
      return Stream.of(this.a, this.b, this.c).anyMatch(cwd::c);
   }

   public static class a implements cwk<cwx> {
      private static final Codec<cwx> y = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  cwd.c.fieldOf("template").forGetter($$0x -> $$0x.a),
                  cwd.c.fieldOf("base").forGetter($$0x -> $$0x.b),
                  cwd.c.fieldOf("addition").forGetter($$0x -> $$0x.c),
                  csd.a.fieldOf("result").forGetter($$0x -> $$0x.d)
               )
               .apply($$0, cwx::new)
      );
      public static final yq<wd, cwx> x = yq.a(cwx.a::a, cwx.a::a);

      @Override
      public Codec<cwx> a() {
         return y;
      }

      @Override
      public yq<wd, cwx> b() {
         return x;
      }

      private static cwx a(wd $$0) {
         cwd $$1 = cwd.b.decode($$0);
         cwd $$2 = cwd.b.decode($$0);
         cwd $$3 = cwd.b.decode($$0);
         csd $$4 = csd.f.decode($$0);
         return new cwx($$1, $$2, $$3, $$4);
      }

      private static void a(wd $$0, cwx $$1) {
         cwd.b.encode($$0, $$1.a);
         cwd.b.encode($$0, $$1.b);
         cwd.b.encode($$0, $$1.c);
         csd.f.encode($$0, $$1.d);
      }
   }
}
