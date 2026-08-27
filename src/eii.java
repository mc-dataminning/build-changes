import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class eii extends eir {
   public static final Codec<eii> a = RecordCodecBuilder.create($$0 -> a($$0).and(eii.a.e.fieldOf("source").forGetter($$0x -> $$0x.b)).apply($$0, eii::new));
   private final eii.a b;

   private eii(List<eke> $$0, eii.a $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public eit b() {
      return eiu.o;
   }

   @Override
   public Set<ejn<?>> a() {
      return ImmutableSet.of(this.b.g);
   }

   @Override
   public cng a(cng $$0, ehf $$1) {
      if ($$1.c(this.b.g) instanceof bkh $$3 && $$3.ae()) {
         $$0.a($$3.Q_());
      }

      return $$0;
   }

   public static eir.a<?> a(eii.a $$0) {
      return a($$1 -> new eii($$1, $$0));
   }

   public static enum a implements avl {
      a("this", ejq.a),
      b("killer", ejq.d),
      c("killer_player", ejq.b),
      d("block_entity", ejq.h);

      public static final Codec<eii.a> e = avl.a(eii.a::values);
      private final String f;
      final ejn<?> g;

      private a(String $$0, ejn<?> $$1) {
         this.f = $$0;
         this.g = $$1;
      }

      @Override
      public String c() {
         return this.f;
      }
   }
}
