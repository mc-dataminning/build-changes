import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class evq extends euy {
   public static final MapCodec<evq> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and($$0.group(ext.a.fieldOf("count").forGetter($$0x -> $$0x.b), Codec.BOOL.fieldOf("add").orElse(false).forGetter($$0x -> $$0x.c)))
            .apply($$0, evq::new)
   );
   private final exs b;
   private final boolean c;

   private evq(List<eww> $$0, exs $$1, boolean $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public eva<evq> b() {
      return evb.e;
   }

   @Override
   public Set<ewe<?>> a() {
      return this.b.a();
   }

   @Override
   public cvs a(cvs $$0, etl $$1) {
      int $$2 = this.c ? $$0.K() : 0;
      $$0.e($$2 + this.b.a($$1));
      return $$0;
   }

   public static euy.a<?> a(exs $$0) {
      return a($$1 -> new evq($$1, $$0, false));
   }

   public static euy.a<?> a(exs $$0, boolean $$1) {
      return a($$2 -> new evq($$2, $$0, $$1));
   }
}
