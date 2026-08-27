import com.google.common.collect.ImmutableMap;

public class esf {
   public static final esn a = new esn(0, esn.a.a, esn.b.a, 3);
   public static final esn b = new esn(0, esn.a.b, esn.b.c, 4);
   public static final esn c = new esn(0, esn.a.a, esn.b.d, 2);
   public static final esn d = new esn(1, esn.a.e, esn.b.d, 2);
   public static final esn e = new esn(2, esn.a.e, esn.b.d, 2);
   public static final esn f = new esn(0, esn.a.c, esn.b.b, 3);
   public static final esn g = new esn(0, esn.a.c, esn.b.e, 1);
   public static final esn h = c;
   public static final esm i = new esm(ImmutableMap.builder().put("Position", a).put("UV", h).put("Color", b).build());
   public static final esm j = new esm(
      ImmutableMap.builder().put("Position", a).put("Color", b).put("UV0", c).put("UV2", e).put("Normal", f).put("Padding", g).build()
   );
   public static final esm k = new esm(
      ImmutableMap.builder().put("Position", a).put("Color", b).put("UV0", c).put("UV1", d).put("UV2", e).put("Normal", f).put("Padding", g).build()
   );
   public static final esm l = new esm(ImmutableMap.builder().put("Position", a).put("UV0", c).put("Color", b).put("UV2", e).build());
   public static final esm m = new esm(ImmutableMap.builder().put("Position", a).build());
   public static final esm n = new esm(ImmutableMap.builder().put("Position", a).put("Color", b).build());
   public static final esm o = new esm(ImmutableMap.builder().put("Position", a).put("Color", b).put("Normal", f).put("Padding", g).build());
   public static final esm p = new esm(ImmutableMap.builder().put("Position", a).put("Color", b).put("UV2", e).build());
   public static final esm q = new esm(ImmutableMap.builder().put("Position", a).put("UV0", c).build());
   public static final esm r = new esm(ImmutableMap.builder().put("Position", a).put("Color", b).put("UV0", c).build());
   public static final esm s = new esm(ImmutableMap.builder().put("Position", a).put("UV0", c).put("Color", b).build());
   public static final esm t = new esm(ImmutableMap.builder().put("Position", a).put("Color", b).put("UV0", c).put("UV2", e).build());
   public static final esm u = new esm(ImmutableMap.builder().put("Position", a).put("UV0", c).put("UV2", e).put("Color", b).build());
   public static final esm v = new esm(ImmutableMap.builder().put("Position", a).put("UV0", c).put("Color", b).put("Normal", f).put("Padding", g).build());
}
