import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class edq extends edw {
   public static final Codec<edq> a = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and($$0.group(egf.a.fieldOf("levels").forGetter($$0x -> $$0x.b), Codec.BOOL.fieldOf("treasure").orElse(false).forGetter($$0x -> $$0x.c)))
            .apply($$0, edq::new)
   );
   private final ege b;
   private final boolean c;

   edq(List<efj> $$0, ege $$1, boolean $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public edy b() {
      return edz.d;
   }

   @Override
   public Set<ees<?>> a() {
      return this.b.a();
   }

   @Override
   public cjl a(cjl $$0, eck $$1) {
      ash $$2 = $$1.b();
      return cnw.a($$2, $$0, this.b.a($$1), this.c);
   }

   public static edq.a a(ege $$0) {
      return new edq.a($$0);
   }

   public static class a extends edw.a<edq.a> {
      private final ege a;
      private boolean b;

      public a(ege $$0) {
         this.a = $$0;
      }

      protected edq.a a() {
         return this;
      }

      public edq.a e() {
         this.b = true;
         return this;
      }

      @Override
      public edx b() {
         return new edq(this.g(), this.a, this.b);
      }
   }
}
