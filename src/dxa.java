import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dxa(ih<cmm> c, dxc d) {
   public static final Codec<dxa> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(aha.a(ke.F).fieldOf("display").forGetter($$0x -> $$0x.c), dxc.a.fieldOf("settings").forGetter($$0x -> $$0x.d)).apply($$0, dxa::new)
   );
   public static final Codec<ih<dxa>> b = agz.a(ke.az, a);

   public ih<cmm> a() {
      return this.c;
   }

   public dxc b() {
      return this.d;
   }
}
