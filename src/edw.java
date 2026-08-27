import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class edw extends eec {
   public static final Codec<edw> a = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and($$0.group(egl.a.fieldOf("levels").forGetter($$0x -> $$0x.b), Codec.BOOL.fieldOf("treasure").orElse(false).forGetter($$0x -> $$0x.c)))
            .apply($$0, edw::new)
   );
   private final egk b;
   private final boolean c;

   edw(List<efp> $$0, egk $$1, boolean $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public eee b() {
      return eef.d;
   }

   @Override
   public Set<eey<?>> a() {
      return this.b.a();
   }

   @Override
   public cjf a(cjf $$0, ecq $$1) {
      asc $$2 = $$1.b();
      return cnq.a($$2, $$0, this.b.a($$1), this.c);
   }

   public static edw.a a(egk $$0) {
      return new edw.a($$0);
   }

   public static class a extends eec.a<edw.a> {
      private final egk a;
      private boolean b;

      public a(egk $$0) {
         this.a = $$0;
      }

      protected edw.a a() {
         return this;
      }

      public edw.a e() {
         this.b = true;
         return this;
      }

      @Override
      public eed b() {
         return new edw(this.g(), this.a, this.b);
      }
   }
}
