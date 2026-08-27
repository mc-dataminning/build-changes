import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.slf4j.Logger;

public record dsp(List<dse> a) {
   private static final Logger b = LogUtils.getLogger();
   private static final acq c = new acq("jigsaw");
   private static final Map<acq, acq> d = ImmutableMap.builder()
      .put(new acq("nvi"), c)
      .put(new acq("pcp"), c)
      .put(new acq("bastionremnant"), c)
      .put(new acq("runtime"), c)
      .build();

   public dsp(List<dse> a) {
      this.a = List.copyOf(a);
   }

   public boolean a() {
      return this.a.isEmpty();
   }

   public boolean a(gu $$0) {
      for (dse $$1 : this.a) {
         if ($$1.f().b($$0)) {
            return true;
         }
      }

      return false;
   }

   public rk a(dsq $$0) {
      qx $$1 = new qx();

      for (dse $$2 : this.a) {
         $$1.add($$2.a($$0));
      }

      return $$1;
   }

   public static dsp a(qx $$0, dsq $$1) {
      List<dse> $$2 = Lists.newArrayList();

      for (int $$3 = 0; $$3 < $$0.size(); $$3++) {
         qr $$4 = $$0.a($$3);
         String $$5 = $$4.l("id").toLowerCase(Locale.ROOT);
         acq $$6 = new acq($$5);
         acq $$7 = d.getOrDefault($$6, $$6);
         dsr $$8 = jb.T.a($$7);
         if ($$8 == null) {
            b.error("Unknown structure piece id: {}", $$7);
         } else {
            try {
               dse $$9 = $$8.load($$1, $$4);
               $$2.add($$9);
            } catch (Exception var10) {
               b.error("Exception loading structure piece with id {}", $$7, var10);
            }
         }
      }

      return new dsp($$2);
   }

   public drs b() {
      return dse.a(this.a.stream());
   }

   public List<dse> c() {
      return this.a;
   }
}
