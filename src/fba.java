import com.google.common.collect.ImmutableMap;

public class fba {
   public static final fbi a = new fbi(0, fbi.a.a, fbi.b.a, 3);
   public static final fbi b = new fbi(0, fbi.a.b, fbi.b.c, 4);
   public static final fbi c = new fbi(0, fbi.a.a, fbi.b.d, 2);
   public static final fbi d = new fbi(1, fbi.a.e, fbi.b.d, 2);
   public static final fbi e = new fbi(2, fbi.a.e, fbi.b.d, 2);
   public static final fbi f = new fbi(0, fbi.a.c, fbi.b.b, 3);
   public static final fbi g = new fbi(0, fbi.a.c, fbi.b.e, 1);
   public static final fbi h = c;
   public static final fbh i = new fbh(ImmutableMap.builder().put("Position", a).put("UV", h).put("Color", b).build());
   public static final fbh j = new fbh(
      ImmutableMap.builder().put("Position", a).put("Color", b).put("UV0", c).put("UV2", e).put("Normal", f).put("Padding", g).build()
   );
   public static final fbh k = new fbh(
      ImmutableMap.builder().put("Position", a).put("Color", b).put("UV0", c).put("UV1", d).put("UV2", e).put("Normal", f).put("Padding", g).build()
   );
   public static final fbh l = new fbh(ImmutableMap.builder().put("Position", a).put("UV0", c).put("Color", b).put("UV2", e).build());
   public static final fbh m = new fbh(ImmutableMap.builder().put("Position", a).build());
   public static final fbh n = new fbh(ImmutableMap.builder().put("Position", a).put("Color", b).build());
   public static final fbh o = new fbh(ImmutableMap.builder().put("Position", a).put("Color", b).put("Normal", f).put("Padding", g).build());
   public static final fbh p = new fbh(ImmutableMap.builder().put("Position", a).put("Color", b).put("UV2", e).build());
   public static final fbh q = new fbh(ImmutableMap.builder().put("Position", a).put("UV0", c).build());
   public static final fbh r = new fbh(ImmutableMap.builder().put("Position", a).put("Color", b).put("UV0", c).build());
   public static final fbh s = new fbh(ImmutableMap.builder().put("Position", a).put("UV0", c).put("Color", b).build());
   public static final fbh t = new fbh(ImmutableMap.builder().put("Position", a).put("Color", b).put("UV0", c).put("UV2", e).build());
   public static final fbh u = new fbh(ImmutableMap.builder().put("Position", a).put("UV0", c).put("UV2", e).put("Color", b).build());
   public static final fbh v = new fbh(ImmutableMap.builder().put("Position", a).put("UV0", c).put("Color", b).put("Normal", f).put("Padding", g).build());
}
