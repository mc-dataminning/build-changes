import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class edn extends edt {
   public static final Codec<edn> a = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and($$0.group(egc.a.fieldOf("levels").forGetter($$0x -> $$0x.b), Codec.BOOL.fieldOf("treasure").orElse(false).forGetter($$0x -> $$0x.c)))
            .apply($$0, edn::new)
   );
   private final egb b;
   private final boolean c;

   edn(List<efg> $$0, egb $$1, boolean $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public edv b() {
      return edw.d;
   }

   @Override
   public Set<eep<?>> a() {
      return this.b.a();
   }

   @Override
   public ciy a(ciy $$0, ech $$1) {
      aru $$2 = $$1.b();
      return cnh.a($$2, $$0, this.b.a($$1), this.c);
   }

   public static edn.a a(egb $$0) {
      return new edn.a($$0);
   }

   public static class a extends edt.a<edn.a> {
      private final egb a;
      private boolean b;

      public a(egb $$0) {
         this.a = $$0;
      }

      protected edn.a a() {
         return this;
      }

      public edn.a e() {
         this.b = true;
         return this;
      }

      @Override
      public edu b() {
         return new edn(this.g(), this.a, this.b);
      }
   }
}
