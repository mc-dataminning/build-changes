import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class cug implements cuf {
   final ctm a;
   final ctm b;
   final ctm c;
   final cqm d;

   public cug(ctm $$0, ctm $$1, ctm $$2, cqm $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   @Override
   public boolean a(bmw $$0, cxb $$1) {
      return this.a.a($$0.a(0)) && this.b.a($$0.a(1)) && this.c.a($$0.a(2));
   }

   @Override
   public cqm a(bmw $$0, iz $$1) {
      return $$0.a(1).a(this.d.d(), this.d.M());
   }

   @Override
   public cqm a(iz $$0) {
      return this.d;
   }

   @Override
   public boolean a(cqm $$0) {
      return this.a.a($$0);
   }

   @Override
   public boolean b(cqm $$0) {
      return this.b.a($$0);
   }

   @Override
   public boolean c(cqm $$0) {
      return this.c.a($$0);
   }

   @Override
   public ctt<?> ar_() {
      return ctt.u;
   }

   @Override
   public boolean i() {
      return Stream.of(this.a, this.b, this.c).anyMatch(ctm::c);
   }

   public static class a implements ctt<cug> {
      private static final Codec<cug> y = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  ctm.c.fieldOf("template").forGetter($$0x -> $$0x.a),
                  ctm.c.fieldOf("base").forGetter($$0x -> $$0x.b),
                  ctm.c.fieldOf("addition").forGetter($$0x -> $$0x.c),
                  cqm.c.fieldOf("result").forGetter($$0x -> $$0x.d)
               )
               .apply($$0, cug::new)
      );
      public static final xs<vf, cug> x = xs.a(cug.a::a, cug.a::a);

      @Override
      public Codec<cug> a() {
         return y;
      }

      @Override
      public xs<vf, cug> b() {
         return x;
      }

      private static cug a(vf $$0) {
         ctm $$1 = ctm.b.decode($$0);
         ctm $$2 = ctm.b.decode($$0);
         ctm $$3 = ctm.b.decode($$0);
         cqm $$4 = cqm.f.decode($$0);
         return new cug($$1, $$2, $$3, $$4);
      }

      private static void a(vf $$0, cug $$1) {
         ctm.b.encode($$0, $$1.a);
         ctm.b.encode($$0, $$1.b);
         ctm.b.encode($$0, $$1.c);
         cqm.f.encode($$0, $$1.d);
      }
   }
}
