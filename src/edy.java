import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class edy extends eee {
   public static final Codec<edy> a = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and($$0.group(egn.a.fieldOf("levels").forGetter($$0x -> $$0x.b), Codec.BOOL.fieldOf("treasure").orElse(false).forGetter($$0x -> $$0x.c)))
            .apply($$0, edy::new)
   );
   private final egm b;
   private final boolean c;

   edy(List<efr> $$0, egm $$1, boolean $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public eeg b() {
      return eeh.d;
   }

   @Override
   public Set<efa<?>> a() {
      return this.b.a();
   }

   @Override
   public cjh a(cjh $$0, ecs $$1) {
      ase $$2 = $$1.b();
      return cns.a($$2, $$0, this.b.a($$1), this.c);
   }

   public static edy.a a(egm $$0) {
      return new edy.a($$0);
   }

   public static class a extends eee.a<edy.a> {
      private final egm a;
      private boolean b;

      public a(egm $$0) {
         this.a = $$0;
      }

      protected edy.a a() {
         return this;
      }

      public edy.a e() {
         this.b = true;
         return this;
      }

      @Override
      public eef b() {
         return new edy(this.g(), this.a, this.b);
      }
   }
}
