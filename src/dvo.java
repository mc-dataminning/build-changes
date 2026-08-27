import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.slf4j.Logger;

public record dvo(List<dvd> a) {
   private static final Logger b = LogUtils.getLogger();
   private static final aer c = new aer("jigsaw");
   private static final Map<aer, aer> d = ImmutableMap.builder()
      .put(new aer("nvi"), c)
      .put(new aer("pcp"), c)
      .put(new aer("bastionremnant"), c)
      .put(new aer("runtime"), c)
      .build();

   public dvo(List<dvd> a) {
      this.a = List.copyOf(a);
   }

   public boolean a() {
      return this.a.isEmpty();
   }

   public boolean a(gu $$0) {
      for (dvd $$1 : this.a) {
         if ($$1.f().b($$0)) {
            return true;
         }
      }

      return false;
   }

   public rk a(dvp $$0) {
      qx $$1 = new qx();

      for (dvd $$2 : this.a) {
         $$1.add($$2.a($$0));
      }

      return $$1;
   }

   public static dvo a(qx $$0, dvp $$1) {
      List<dvd> $$2 = Lists.newArrayList();

      for (int $$3 = 0; $$3 < $$0.size(); $$3++) {
         qr $$4 = $$0.a($$3);
         String $$5 = $$4.l("id").toLowerCase(Locale.ROOT);
         aer $$6 = new aer($$5);
         aer $$7 = d.getOrDefault($$6, $$6);
         dvq $$8 = jb.T.a($$7);
         if ($$8 == null) {
            b.error("Unknown structure piece id: {}", $$7);
         } else {
            try {
               dvd $$9 = $$8.load($$1, $$4);
               $$2.add($$9);
            } catch (Exception var10) {
               b.error("Exception loading structure piece with id {}", $$7, var10);
            }
         }
      }

      return new dvo($$2);
   }

   public dur b() {
      return dvd.a(this.a.stream());
   }

   public List<dvd> c() {
      return this.a;
   }
}
