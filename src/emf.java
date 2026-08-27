import com.google.common.collect.ImmutableMap;

public class emf {
   public static final emn a = new emn(0, emn.a.a, emn.b.a, 3);
   public static final emn b = new emn(0, emn.a.b, emn.b.c, 4);
   public static final emn c = new emn(0, emn.a.a, emn.b.d, 2);
   public static final emn d = new emn(1, emn.a.e, emn.b.d, 2);
   public static final emn e = new emn(2, emn.a.e, emn.b.d, 2);
   public static final emn f = new emn(0, emn.a.c, emn.b.b, 3);
   public static final emn g = new emn(0, emn.a.c, emn.b.e, 1);
   public static final emn h = c;
   public static final emm i = new emm(ImmutableMap.builder().put("Position", a).put("UV", h).put("Color", b).build());
   public static final emm j = new emm(
      ImmutableMap.builder().put("Position", a).put("Color", b).put("UV0", c).put("UV2", e).put("Normal", f).put("Padding", g).build()
   );
   public static final emm k = new emm(
      ImmutableMap.builder().put("Position", a).put("Color", b).put("UV0", c).put("UV1", d).put("UV2", e).put("Normal", f).put("Padding", g).build()
   );
   public static final emm l = new emm(ImmutableMap.builder().put("Position", a).put("UV0", c).put("Color", b).put("UV2", e).build());
   public static final emm m = new emm(ImmutableMap.builder().put("Position", a).build());
   public static final emm n = new emm(ImmutableMap.builder().put("Position", a).put("Color", b).build());
   public static final emm o = new emm(ImmutableMap.builder().put("Position", a).put("Color", b).put("Normal", f).put("Padding", g).build());
   public static final emm p = new emm(ImmutableMap.builder().put("Position", a).put("Color", b).put("UV2", e).build());
   public static final emm q = new emm(ImmutableMap.builder().put("Position", a).put("UV0", c).build());
   public static final emm r = new emm(ImmutableMap.builder().put("Position", a).put("Color", b).put("UV0", c).build());
   public static final emm s = new emm(ImmutableMap.builder().put("Position", a).put("UV0", c).put("Color", b).build());
   public static final emm t = new emm(ImmutableMap.builder().put("Position", a).put("Color", b).put("UV0", c).put("UV2", e).build());
   public static final emm u = new emm(ImmutableMap.builder().put("Position", a).put("UV0", c).put("UV2", e).put("Color", b).build());
   public static final emm v = new emm(ImmutableMap.builder().put("Position", a).put("UV0", c).put("Color", b).put("Normal", f).put("Padding", g).build());
}
