import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class exq extends eyb {
   public static final MapCodec<exq> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(exq.a.e.fieldOf("source").forGetter($$0x -> $$0x.b)).apply($$0, exq::new)
   );
   private final exq.a b;

   private exq(List<ezx> $$0, exq.a $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public eyd<exq> b() {
      return eye.s;
   }

   @Override
   public Set<bai<?>> a() {
      return Set.of(this.b.g);
   }

   @Override
   public cxh a(cxh $$0, ewo $$1) {
      if ($$1.c(this.b.g) instanceof btb $$3) {
         $$0.b(kv.g, $$3.an());
      }

      return $$0;
   }

   public static eyb.a<?> a(exq.a $$0) {
      return a($$1 -> new exq($$1, $$0));
   }

   public static enum a implements azv {
      a("this", ezi.a),
      b("attacking_entity", ezi.d),
      c("last_damage_player", ezi.b),
      d("block_entity", ezi.h);

      public static final Codec<exq.a> e = azv.a(exq.a::values);
      private final String f;
      final bai<?> g;

      private a(final String $$0, final bai<?> $$1) {
         this.f = $$0;
         this.g = $$1;
      }

      @Override
      public String c() {
         return this.f;
      }
   }
}
