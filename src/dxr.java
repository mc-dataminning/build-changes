import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dxr implements dxz {
   public static final Codec<dxr> a = RecordCodecBuilder.create($$0 -> $$0.group(ir.a.fieldOf("pos").forGetter($$0x -> $$0x.e)).apply($$0, dxr::new));
   public static final zc<wp, dxr> b = zc.a(ir.b, $$0 -> $$0.e, dxr::new);
   private final ir e;

   public dxr(ir $$0) {
      this.e = $$0;
   }

   @Override
   public Optional<ewu> a(dca $$0) {
      return Optional.of(ewu.b(this.e));
   }

   @Override
   public dya<dxr> a() {
      return dya.a;
   }

   public static class a implements dya<dxr> {
      @Override
      public Codec<dxr> a() {
         return dxr.a;
      }

      @Override
      public zc<wp, dxr> b() {
         return dxr.b;
      }
   }
}
