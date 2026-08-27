import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.slf4j.Logger;

public record dvm(List<dvb> a) {
   private static final Logger b = LogUtils.getLogger();
   private static final aep c = new aep("jigsaw");
   private static final Map<aep, aep> d = ImmutableMap.builder()
      .put(new aep("nvi"), c)
      .put(new aep("pcp"), c)
      .put(new aep("bastionremnant"), c)
      .put(new aep("runtime"), c)
      .build();

   public dvm(List<dvb> a) {
      this.a = List.copyOf(a);
   }

   public boolean a() {
      return this.a.isEmpty();
   }

   public boolean a(gv $$0) {
      for (dvb $$1 : this.a) {
         if ($$1.f().b($$0)) {
            return true;
         }
      }

      return false;
   }

   public rl a(dvn $$0) {
      qy $$1 = new qy();

      for (dvb $$2 : this.a) {
         $$1.add($$2.a($$0));
      }

      return $$1;
   }

   public static dvm a(qy $$0, dvn $$1) {
      List<dvb> $$2 = Lists.newArrayList();

      for (int $$3 = 0; $$3 < $$0.size(); $$3++) {
         qs $$4 = $$0.a($$3);
         String $$5 = $$4.l("id").toLowerCase(Locale.ROOT);
         aep $$6 = new aep($$5);
         aep $$7 = d.getOrDefault($$6, $$6);
         dvo $$8 = jc.T.a($$7);
         if ($$8 == null) {
            b.error("Unknown structure piece id: {}", $$7);
         } else {
            try {
               dvb $$9 = $$8.load($$1, $$4);
               $$2.add($$9);
            } catch (Exception var10) {
               b.error("Exception loading structure piece with id {}", $$7, var10);
            }
         }
      }

      return new dvm($$2);
   }

   public dup b() {
      return dvb.a(this.a.stream());
   }

   public List<dvb> c() {
      return this.a;
   }
}
