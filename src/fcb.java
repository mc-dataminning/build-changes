import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.BiFunction;

public class fcb implements fbx {
   public static final MapCodec<fcb> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(fbz.b.listOf().fieldOf("functions").forGetter($$0x -> $$0x.c)).apply($$0, fcb::new)
   );
   public static final Codec<fcb> b = fbz.b.listOf().xmap(fcb::new, $$0 -> $$0.c);
   private final List<fbx> c;
   private final BiFunction<daa, faj, daa> d;

   private fcb(List<fbx> $$0) {
      this.c = $$0;
      this.d = fbz.a($$0);
   }

   public static fcb a(List<fbx> $$0) {
      return new fcb(List.copyOf($$0));
   }

   public daa a(daa $$0, faj $$1) {
      return this.d.apply($$0, $$1);
   }

   @Override
   public void a(fap $$0) {
      fbx.super.a($$0);

      for (int $$1 = 0; $$1 < this.c.size(); $$1++) {
         this.c.get($$1).a($$0.a(".function[" + $$1 + "]"));
      }
   }

   @Override
   public fby<fcb> b() {
      return fbz.I;
   }
}
