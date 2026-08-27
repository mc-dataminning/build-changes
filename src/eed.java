import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class eed extends eej {
   public static final Codec<eed> a = RecordCodecBuilder.create($$0 -> $$0.group(ecg.b.fieldOf("feature").forGetter($$0x -> $$0x.b), d()).apply($$0, eed::new));
   private final il<ecg> b;
   private final ta c;

   protected eed(il<ecg> $$0, eel.a $$1) {
      super($$1);
      this.b = $$0;
      this.c = this.b();
   }

   private ta b() {
      ta $$0 = new ta();
      $$0.a("name", "minecraft:bottom");
      $$0.a("final_state", "minecraft:air");
      $$0.a("pool", "minecraft:empty");
      $$0.a("target", "minecraft:empty");
      $$0.a("joint", dlg.a.a.c());
      return $$0;
   }

   @Override
   public jg a(ehd $$0, dgm $$1) {
      return jg.g;
   }

   @Override
   public List<ehc.c> a(ehd $$0, ib $$1, dgm $$2, axd $$3) {
      List<ehc.c> $$4 = Lists.newArrayList();
      $$4.add(new ehc.c($$1, dac.pb.o().a(deb.b, ij.a(ih.a, ih.d)), this.c));
      return $$4;
   }

   @Override
   public ecu a(ehd $$0, ib $$1, dgm $$2) {
      jg $$3 = this.a($$0, $$2);
      return new ecu($$1.u(), $$1.v(), $$1.w(), $$1.u() + $$3.u(), $$1.v() + $$3.v(), $$1.w() + $$3.w());
   }

   @Override
   public boolean a(ehd $$0, cxu $$1, cxs $$2, dow $$3, ib $$4, ib $$5, dgm $$6, ecu $$7, axd $$8, boolean $$9) {
      return this.b.a().a($$1, $$3, $$8, $$4);
   }

   @Override
   public eek<?> a() {
      return eek.c;
   }

   @Override
   public String toString() {
      return "Feature[" + this.b + "]";
   }
}
