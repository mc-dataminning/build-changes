import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class eah extends ean {
   public static final Codec<eah> a = RecordCodecBuilder.create($$0 -> $$0.group(dyk.b.fieldOf("feature").forGetter($$0x -> $$0x.b), d()).apply($$0, eah::new));
   private final ih<dyk> b;
   private final sn c;

   protected eah(ih<dyk> $$0, eap.a $$1) {
      super($$1);
      this.b = $$0;
      this.c = this.b();
   }

   private sn b() {
      sn $$0 = new sn();
      $$0.a("name", "minecraft:bottom");
      $$0.a("final_state", "minecraft:air");
      $$0.a("pool", "minecraft:empty");
      $$0.a("target", "minecraft:empty");
      $$0.a("joint", dhv.a.a.c());
      return $$0;
   }

   @Override
   public jb a(edh $$0, ddc $$1) {
      return jb.g;
   }

   @Override
   public List<edg.c> a(edh $$0, hx $$1, ddc $$2, auv $$3) {
      List<edg.c> $$4 = Lists.newArrayList();
      $$4.add(new edg.c($$1, cws.pb.o().a(dar.b, ie.a(ic.a, ic.d)), this.c));
      return $$4;
   }

   @Override
   public dyy a(edh $$0, hx $$1, ddc $$2) {
      jb $$3 = this.a($$0, $$2);
      return new dyy($$1.u(), $$1.v(), $$1.w(), $$1.u() + $$3.u(), $$1.v() + $$3.v(), $$1.w() + $$3.w());
   }

   @Override
   public boolean a(edh $$0, cuk $$1, cui $$2, dle $$3, hx $$4, hx $$5, ddc $$6, dyy $$7, auv $$8, boolean $$9) {
      return this.b.a().a($$1, $$3, $$8, $$4);
   }

   @Override
   public eao<?> a() {
      return eao.c;
   }

   @Override
   public String toString() {
      return "Feature[" + this.b + "]";
   }
}
