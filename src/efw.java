import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.slf4j.Logger;

public record efw(List<efl> a) {
   private static final Logger b = LogUtils.getLogger();
   private static final ajt c = new ajt("jigsaw");
   private static final Map<ajt, ajt> d = ImmutableMap.builder()
      .put(new ajt("nvi"), c)
      .put(new ajt("pcp"), c)
      .put(new ajt("bastionremnant"), c)
      .put(new ajt("runtime"), c)
      .build();

   public efw(List<efl> a) {
      this.a = List.copyOf(a);
   }

   public boolean a() {
      return this.a.isEmpty();
   }

   public boolean a(ib $$0) {
      for (efl $$1 : this.a) {
         if ($$1.f().b($$0)) {
            return true;
         }
      }

      return false;
   }

   public uj a(efx $$0) {
      ts $$1 = new ts();

      for (efl $$2 : this.a) {
         $$1.add($$2.a($$0));
      }

      return $$1;
   }

   public static efw a(ts $$0, efx $$1) {
      List<efl> $$2 = Lists.newArrayList();

      for (int $$3 = 0; $$3 < $$0.size(); $$3++) {
         tm $$4 = $$0.a($$3);
         String $$5 = $$4.l("id").toLowerCase(Locale.ROOT);
         ajt $$6 = new ajt($$5);
         ajt $$7 = d.getOrDefault($$6, $$6);
         efy $$8 = kr.S.a($$7);
         if ($$8 == null) {
            b.error("Unknown structure piece id: {}", $$7);
         } else {
            try {
               efl $$9 = $$8.load($$1, $$4);
               $$2.add($$9);
            } catch (Exception var10) {
               b.error("Exception loading structure piece with id {}", $$7, var10);
            }
         }
      }

      return new efw($$2);
   }

   public eez b() {
      return efl.a(this.a.stream());
   }

   public List<efl> c() {
      return this.a;
   }
}
