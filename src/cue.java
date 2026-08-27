import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class cue implements cud {
   final ctk a;
   final ctk b;
   final ctk c;
   final cqk d;

   public cue(ctk $$0, ctk $$1, ctk $$2, cqk $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   @Override
   public boolean a(bmv $$0, cwz $$1) {
      return this.a.a($$0.a(0)) && this.b.a($$0.a(1)) && this.c.a($$0.a(2));
   }

   @Override
   public cqk a(bmv $$0, iz $$1) {
      return $$0.a(1).a(this.d.d(), this.d.M());
   }

   @Override
   public cqk a(iz $$0) {
      return this.d;
   }

   @Override
   public boolean a(cqk $$0) {
      return this.a.a($$0);
   }

   @Override
   public boolean b(cqk $$0) {
      return this.b.a($$0);
   }

   @Override
   public boolean c(cqk $$0) {
      return this.c.a($$0);
   }

   @Override
   public ctr<?> ar_() {
      return ctr.u;
   }

   @Override
   public boolean i() {
      return Stream.of(this.a, this.b, this.c).anyMatch(ctk::c);
   }

   public static class a implements ctr<cue> {
      private static final Codec<cue> y = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  ctk.c.fieldOf("template").forGetter($$0x -> $$0x.a),
                  ctk.c.fieldOf("base").forGetter($$0x -> $$0x.b),
                  ctk.c.fieldOf("addition").forGetter($$0x -> $$0x.c),
                  cqk.c.fieldOf("result").forGetter($$0x -> $$0x.d)
               )
               .apply($$0, cue::new)
      );
      public static final xs<vf, cue> x = xs.a(cue.a::a, cue.a::a);

      @Override
      public Codec<cue> a() {
         return y;
      }

      @Override
      public xs<vf, cue> b() {
         return x;
      }

      private static cue a(vf $$0) {
         ctk $$1 = ctk.b.decode($$0);
         ctk $$2 = ctk.b.decode($$0);
         ctk $$3 = ctk.b.decode($$0);
         cqk $$4 = cqk.f.decode($$0);
         return new cue($$1, $$2, $$3, $$4);
      }

      private static void a(vf $$0, cue $$1) {
         ctk.b.encode($$0, $$1.a);
         ctk.b.encode($$0, $$1.b);
         ctk.b.encode($$0, $$1.c);
         cqk.f.encode($$0, $$1.d);
      }
   }
}
