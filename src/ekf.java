import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class ekf extends eko {
   public static final Codec<ekf> a = RecordCodecBuilder.create($$0 -> a($$0).and(ekf.a.e.fieldOf("source").forGetter($$0x -> $$0x.b)).apply($$0, ekf::new));
   private final ekf.a b;

   private ekf(List<emb> $$0, ekf.a $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public ekq b() {
      return ekr.o;
   }

   @Override
   public Set<elk<?>> a() {
      return ImmutableSet.of(this.b.g);
   }

   @Override
   public cpd a(cpd $$0, ejc $$1) {
      if ($$1.c(this.b.g) instanceof bmb $$3 && $$3.ae()) {
         $$0.a($$3.Q_());
      }

      return $$0;
   }

   public static eko.a<?> a(ekf.a $$0) {
      return a($$1 -> new ekf($$1, $$0));
   }

   public static enum a implements axc {
      a("this", eln.a),
      b("killer", eln.d),
      c("killer_player", eln.b),
      d("block_entity", eln.h);

      public static final Codec<ekf.a> e = axc.a(ekf.a::values);
      private final String f;
      final elk<?> g;

      private a(String $$0, elk<?> $$1) {
         this.f = $$0;
         this.g = $$1;
      }

      @Override
      public String c() {
         return this.f;
      }
   }
}
