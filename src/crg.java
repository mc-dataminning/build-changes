import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;
import it.unimi.dsi.fastutil.ints.IntLists;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class crg {
   private static final List<crf> b = ad.a(new ArrayList<>(), $$0 -> {
      a($$0, "contents", 0);
      a($$0, "container.", 0, 54);
      a($$0, "hotbar.", 0, 9);
      a($$0, "inventory.", 9, 27);
      a($$0, "enderchest.", 200, 27);
      a($$0, "villager.", 300, 8);
      a($$0, "horse.", 500, 15);
      int $$1 = bsc.a.a(98);
      int $$2 = bsc.b.a(98);
      a($$0, "weapon", $$1);
      a($$0, "weapon.mainhand", $$1);
      a($$0, "weapon.offhand", $$2);
      a($$0, "weapon.*", $$1, $$2);
      $$1 = bsc.f.a(100);
      $$2 = bsc.e.a(100);
      int $$5 = bsc.d.a(100);
      int $$6 = bsc.c.a(100);
      int $$7 = bsc.g.a(105);
      a($$0, "armor.head", $$1);
      a($$0, "armor.chest", $$2);
      a($$0, "armor.legs", $$5);
      a($$0, "armor.feet", $$6);
      a($$0, "armor.body", $$7);
      a($$0, "armor.*", $$1, $$2, $$5, $$6, $$7);
      a($$0, "horse.saddle", 400);
      a($$0, "horse.chest", 499);
      a($$0, "player.cursor", 499);
      a($$0, "player.crafting.", 500, 4);
   });
   public static final Codec<crf> a = azg.b(() -> b.toArray(new crf[0]));
   private static final Function<String, crf> c = azg.a(b.toArray(new crf[0]), $$0 -> $$0);

   private static crf a(String $$0, int $$1) {
      return crf.a($$0, IntLists.singleton($$1));
   }

   private static crf a(String $$0, IntList $$1) {
      return crf.a($$0, IntLists.unmodifiable($$1));
   }

   private static crf a(String $$0, int... $$1) {
      return crf.a($$0, IntList.of($$1));
   }

   private static void a(List<crf> $$0, String $$1, int $$2) {
      $$0.add(a($$1, $$2));
   }

   private static void a(List<crf> $$0, String $$1, int $$2, int $$3) {
      IntList $$4 = new IntArrayList($$3);

      for (int $$5 = 0; $$5 < $$3; $$5++) {
         int $$6 = $$2 + $$5;
         $$0.add(a($$1 + $$5, $$6));
         $$4.add($$6);
      }

      $$0.add(a($$1 + "*", $$4));
   }

   private static void a(List<crf> $$0, String $$1, int... $$2) {
      $$0.add(a($$1, $$2));
   }

   @Nullable
   public static crf a(String $$0) {
      return c.apply($$0);
   }

   public static Stream<String> a() {
      return b.stream().map(azg::c);
   }

   public static Stream<String> b() {
      return b.stream().filter($$0 -> $$0.b() == 1).map(azg::c);
   }
}
