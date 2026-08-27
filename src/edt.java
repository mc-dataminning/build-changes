import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.slf4j.Logger;

public record edt(List<edi> a) {
   private static final Logger b = LogUtils.getLogger();
   private static final ajh c = new ajh("jigsaw");
   private static final Map<ajh, ajh> d = ImmutableMap.builder()
      .put(new ajh("nvi"), c)
      .put(new ajh("pcp"), c)
      .put(new ajh("bastionremnant"), c)
      .put(new ajh("runtime"), c)
      .build();

   public edt(List<edi> a) {
      this.a = List.copyOf(a);
   }

   public boolean a() {
      return this.a.isEmpty();
   }

   public boolean a(ib $$0) {
      for (edi $$1 : this.a) {
         if ($$1.f().b($$0)) {
            return true;
         }
      }

      return false;
   }

   public tx a(edu $$0) {
      tg $$1 = new tg();

      for (edi $$2 : this.a) {
         $$1.add($$2.a($$0));
      }

      return $$1;
   }

   public static edt a(tg $$0, edu $$1) {
      List<edi> $$2 = Lists.newArrayList();

      for (int $$3 = 0; $$3 < $$0.size(); $$3++) {
         ta $$4 = $$0.a($$3);
         String $$5 = $$4.l("id").toLowerCase(Locale.ROOT);
         ajh $$6 = new ajh($$5);
         ajh $$7 = d.getOrDefault($$6, $$6);
         edv $$8 = ki.S.a($$7);
         if ($$8 == null) {
            b.error("Unknown structure piece id: {}", $$7);
         } else {
            try {
               edi $$9 = $$8.load($$1, $$4);
               $$2.add($$9);
            } catch (Exception var10) {
               b.error("Exception loading structure piece with id {}", $$7, var10);
            }
         }
      }

      return new edt($$2);
   }

   public ecw b() {
      return edi.a(this.a.stream());
   }

   public List<edi> c() {
      return this.a;
   }
}
