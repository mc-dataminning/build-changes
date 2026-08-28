import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dhg(dfw d, cru e) {
   public static final String a = "enabled_features";
   public static final Codec<dhg> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dfw.b.lenientOptionalFieldOf("DataPacks", dfw.a).forGetter(dhg::a), crw.f.lenientOptionalFieldOf("enabled_features", crw.h).forGetter(dhg::b)
            )
            .apply($$0, dhg::new)
   );
   public static final dhg c = new dhg(dfw.a, crw.h);

   public dhg a(cru $$0) {
      return new dhg(this.d, this.e.c($$0));
   }

   public dfw a() {
      return this.d;
   }

   public cru b() {
      return this.e;
   }
}
