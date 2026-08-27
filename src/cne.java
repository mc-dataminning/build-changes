import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class cne implements cnd {
   final cmm a;
   final cmm b;
   final cmm c;
   final cjl d;

   public cne(cmm $$0, cmm $$1, cmm $$2, cjl $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   @Override
   public boolean a(bgx $$0, cqb $$1) {
      return this.a.a($$0.a(0)) && this.b.a($$0.a(1)) && this.c.a($$0.a(2));
   }

   @Override
   public cjl a(bgx $$0, hr $$1) {
      cjl $$2 = this.d.p();
      qw $$3 = $$0.a(1).v();
      if ($$3 != null) {
         $$2.c($$3.h());
      }

      return $$2;
   }

   @Override
   public cjl a(hr $$0) {
      return this.d;
   }

   @Override
   public boolean a(cjl $$0) {
      return this.a.a($$0);
   }

   @Override
   public boolean b(cjl $$0) {
      return this.b.a($$0);
   }

   @Override
   public boolean c(cjl $$0) {
      return this.c.a($$0);
   }

   @Override
   public cms<?> an_() {
      return cms.u;
   }

   @Override
   public boolean i() {
      return Stream.of(this.a, this.b, this.c).anyMatch(cmm::c);
   }

   public static class a implements cms<cne> {
      private static final Codec<cne> x = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  cmm.b.fieldOf("template").forGetter($$0x -> $$0x.a),
                  cmm.b.fieldOf("base").forGetter($$0x -> $$0x.b),
                  cmm.b.fieldOf("addition").forGetter($$0x -> $$0x.c),
                  cmg.a.fieldOf("result").forGetter($$0x -> $$0x.d)
               )
               .apply($$0, cne::new)
      );

      @Override
      public Codec<cne> a() {
         return x;
      }

      public cne b(so $$0) {
         cmm $$1 = cmm.b($$0);
         cmm $$2 = cmm.b($$0);
         cmm $$3 = cmm.b($$0);
         cjl $$4 = $$0.r();
         return new cne($$1, $$2, $$3, $$4);
      }

      public void a(so $$0, cne $$1) {
         $$1.a.a($$0);
         $$1.b.a($$0);
         $$1.c.a($$0);
         $$0.a($$1.d);
      }
   }
}
