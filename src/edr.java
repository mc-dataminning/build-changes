import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.slf4j.Logger;

public record edr(List<edg> a) {
   private static final Logger b = LogUtils.getLogger();
   private static final ajh c = new ajh("jigsaw");
   private static final Map<ajh, ajh> d = ImmutableMap.builder()
      .put(new ajh("nvi"), c)
      .put(new ajh("pcp"), c)
      .put(new ajh("bastionremnant"), c)
      .put(new ajh("runtime"), c)
      .build();

   public edr(List<edg> a) {
      this.a = List.copyOf(a);
   }

   public boolean a() {
      return this.a.isEmpty();
   }

   public boolean a(ib $$0) {
      for (edg $$1 : this.a) {
         if ($$1.f().b($$0)) {
            return true;
         }
      }

      return false;
   }

   public tx a(eds $$0) {
      tg $$1 = new tg();

      for (edg $$2 : this.a) {
         $$1.add($$2.a($$0));
      }

      return $$1;
   }

   public static edr a(tg $$0, eds $$1) {
      List<edg> $$2 = Lists.newArrayList();

      for (int $$3 = 0; $$3 < $$0.size(); $$3++) {
         ta $$4 = $$0.a($$3);
         String $$5 = $$4.l("id").toLowerCase(Locale.ROOT);
         ajh $$6 = new ajh($$5);
         ajh $$7 = d.getOrDefault($$6, $$6);
         edt $$8 = ki.S.a($$7);
         if ($$8 == null) {
            b.error("Unknown structure piece id: {}", $$7);
         } else {
            try {
               edg $$9 = $$8.load($$1, $$4);
               $$2.add($$9);
            } catch (Exception var10) {
               b.error("Exception loading structure piece with id {}", $$7, var10);
            }
         }
      }

      return new edr($$2);
   }

   public ecu b() {
      return edg.a(this.a.stream());
   }

   public List<edg> c() {
      return this.a;
   }
}
